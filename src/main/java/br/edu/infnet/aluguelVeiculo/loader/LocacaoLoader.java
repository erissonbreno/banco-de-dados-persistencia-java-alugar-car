package br.edu.infnet.aluguelVeiculo.loader;

import br.edu.infnet.aluguelVeiculo.categoria.Categoria;
import br.edu.infnet.aluguelVeiculo.model.*;
import br.edu.infnet.aluguelVeiculo.service.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.*;
@Order(4)
@Component
public class LocacaoLoader implements ApplicationRunner {

    @Autowired
    LocacaoService locacaoService;
    @Override
    public void run(ApplicationArguments args) throws Exception {

        Map<LocalDateTime, Locacao> mapaLocacao = new HashMap<>();

        FileReader file = new FileReader("src/main/resources/static/locacaoCliente.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos;
        Locacao locacao = new Locacao();

        while (linha != null) {
            campos = linha.split(",");

            switch (campos[0]) {
                case "L":
                    locacao = new Locacao(
                            campos[1],
                            LocalDateTime.now(),
                            new ArrayList<>(),
                            new Usuario(1)
                    );
                    mapaLocacao.put(locacao.getData(), locacao);
                    break;
                case "C":
                    locacao.getVeiculos().add(new Carro(Integer.valueOf(campos[1])));
                    break;
                case "M":
                    locacao.getVeiculos().add(new Moto(Integer.valueOf(campos[1])));
                    break;
                case "B":
                    locacao.getVeiculos().add(new Bicicleta(Integer.valueOf(campos[1])));
                    break;
                default:
                    break;
            }
            linha = leitura.readLine();
        }
        for(Locacao l: mapaLocacao.values()) {
            locacaoService.incluir(l);
        }
        leitura.close();
    }
}
