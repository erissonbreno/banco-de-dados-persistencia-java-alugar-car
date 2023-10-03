package br.edu.infnet.aluguelVeiculo.loader;

import br.edu.infnet.aluguelVeiculo.categoria.Categoria;
import br.edu.infnet.aluguelVeiculo.model.Carro;
import br.edu.infnet.aluguelVeiculo.model.Moto;
import br.edu.infnet.aluguelVeiculo.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Order(2)
@Component
public class MotoLoader implements ApplicationRunner {

    @Autowired
    VeiculoService veiculoService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("src/main/resources/static/moto.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String campos[] = null;

        while (linha != null) {
            campos = linha.split(",");
            Moto moto = new Moto(campos[0],
                    Double.parseDouble(campos[1]),
                    Categoria.valueOf(campos[2]),
                    campos[3],
                    Boolean.getBoolean(campos[4]),
                    campos[5]);
            System.out.println("linha: " + linha);
            System.out.println(moto);
            veiculoService.incluir(moto);
            linha = leitura.readLine();
        }
    }
}
