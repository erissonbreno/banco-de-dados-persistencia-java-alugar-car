package br.edu.infnet.aluguelVeiculo.loader;

import br.edu.infnet.aluguelVeiculo.model.Cliente;
import br.edu.infnet.aluguelVeiculo.model.Usuario;
import br.edu.infnet.aluguelVeiculo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Order(2)
@Component
public class ClienteLoader implements ApplicationRunner {

    @Autowired
    private ClienteService clienteService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("src/main/resources/static/cliente.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos;

        while (linha != null) {
            campos = linha.split(",");
            Cliente cliente = new Cliente(campos[0],
                    Integer.parseInt(campos[1]),
                    campos[2]);

            cliente.setUsuario(new Usuario(1));
            clienteService.incluir(cliente);
            linha = leitura.readLine();
        }
    }
}
