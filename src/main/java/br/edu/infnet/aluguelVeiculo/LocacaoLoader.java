package br.edu.infnet.aluguelVeiculo;

import br.edu.infnet.aluguelVeiculo.categoria.Categoria;
import br.edu.infnet.aluguelVeiculo.model.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.*;

@Component
public class LocacaoLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {

        Map<LocalDateTime, Locacao> mapaLocacao = new HashMap<>();
//        Carro carro = new Carro("Gol", 1200, Categoria.PREMIUM, "VW", false, 50000);
//        Cliente cliente = new Cliente("Breno", 12456, "bre@no");
//        Locacao locacao = new Locacao("Alguel de carro", LocalDateTime.now(), List.of(carro), cliente);
//        System.out.println(locacao);

        FileReader file = new FileReader("src/main/resources/static/locacao.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos;
        Locacao locacao = new Locacao();

        System.out.println("##########################");
        while (linha != null) {
            campos = linha.split(",");

            switch (campos[0]) {
                case "L":
                    locacao = new Locacao(
                            campos[1],
                            LocalDateTime.now(),
                            new ArrayList<>(),
                            new Cliente(campos[2], Integer.parseInt(campos[3]), campos[4])
                    );
                    mapaLocacao.put(locacao.getData(), locacao);
                    break;
                case "C":
                    Carro carro = new Carro(campos[1],
                            Double.parseDouble(campos[2]),
                            Categoria.valueOf(campos[3]),
                            campos[4],
                            Boolean.getBoolean(campos[5]),
                            Integer.parseInt(campos[6]));

                    locacao.getVeiculos().add(carro);
                    break;
                case "M":
                    Moto moto = new Moto(campos[1],
                            Double.parseDouble(campos[2]),
                            Categoria.valueOf(campos[3]),
                            campos[4],
                            Boolean.getBoolean(campos[5]),
                            campos[6]);

                    locacao.getVeiculos().add(moto);
                    break;
                case "B":
                    Bicicleta bike = new Bicicleta(campos[1],
                            Double.parseDouble(campos[2]),
                            Categoria.valueOf(campos[3]),
                            campos[4],
                            Boolean.getBoolean(campos[5]),
                            campos[6]);

                    locacao.getVeiculos().add(bike);
                    break;

                default:
                    break;
            }
            linha = leitura.readLine();
        }
        for(Locacao l: mapaLocacao.values()) {
            System.out.println("[Locacao] Locação realizada com sucesso: " + l);
        }
        leitura.close();
    }
}
