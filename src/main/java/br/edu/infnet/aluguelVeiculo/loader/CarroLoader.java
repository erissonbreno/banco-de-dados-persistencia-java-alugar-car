package br.edu.infnet.aluguelVeiculo.loader;

import br.edu.infnet.aluguelVeiculo.categoria.Categoria;
import br.edu.infnet.aluguelVeiculo.model.Carro;
import br.edu.infnet.aluguelVeiculo.model.Usuario;
import br.edu.infnet.aluguelVeiculo.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
@Order(3)
@Component
public class CarroLoader implements ApplicationRunner {
    @Autowired
    VeiculoService veiculoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {


        FileReader file = new FileReader("src/main/resources/static/carro.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos;

        while (linha != null) {
            campos = linha.split(",");
            Carro carro = new Carro(campos[0],
                    Double.parseDouble(campos[1]),
                    Categoria.valueOf(campos[2]),
                    campos[3],
                    Boolean.getBoolean(campos[4]),
                    Integer.parseInt(campos[5]));
            carro.setUsuario(new Usuario(2));
            veiculoService.incluir(carro);
            linha = leitura.readLine();
        }
    }
}
