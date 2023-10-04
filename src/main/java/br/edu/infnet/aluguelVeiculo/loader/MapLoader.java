package br.edu.infnet.aluguelVeiculo.loader;

import br.edu.infnet.aluguelVeiculo.categoria.Categoria;
import br.edu.infnet.aluguelVeiculo.model.Cliente;
import br.edu.infnet.aluguelVeiculo.model.Moto;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MapLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Moto moto = new Moto("CG150", 300, Categoria.CANSADA, "Honda", true, "Vermelho");
        Cliente maria = new Cliente("Maria", 456789, "maria@maria");
        Cliente breno = new Cliente("Breno", 123456, "bre@no");

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(maria.getCpf(), maria.getNome());
        mapa.put(breno.getCpf(), breno.getNome());

    }
}
