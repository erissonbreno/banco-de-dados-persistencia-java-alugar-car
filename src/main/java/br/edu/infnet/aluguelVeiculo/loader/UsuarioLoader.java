package br.edu.infnet.aluguelVeiculo.loader;

import br.edu.infnet.aluguelVeiculo.model.Cliente;
import br.edu.infnet.aluguelVeiculo.model.Usuario;
import br.edu.infnet.aluguelVeiculo.service.ClienteService;
import br.edu.infnet.aluguelVeiculo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Order(1)
@Component
public class UsuarioLoader implements ApplicationRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("src/main/resources/static/usuario.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos;

        while(linha != null) {
            campos = linha.split(";");

            Usuario usuario = new Usuario();
            usuario.setEmail(campos[0]);
            usuario.setNome(campos[1]);
            usuario.setSenha(campos[2]);

            usuarioService.incluir(usuario);

            linha = leitura.readLine();
        }

        leitura.close();
    }
}
