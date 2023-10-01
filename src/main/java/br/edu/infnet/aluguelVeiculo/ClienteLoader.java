package br.edu.infnet.aluguelVeiculo;

import br.edu.infnet.aluguelVeiculo.categoria.Categoria;
import br.edu.infnet.aluguelVeiculo.controller.ClienteController;
import br.edu.infnet.aluguelVeiculo.model.Carro;
import br.edu.infnet.aluguelVeiculo.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Order(4)
@Component
public class ClienteLoader implements ApplicationRunner {

    private Map<Integer, Cliente> mapaCliente;

    public Collection<Cliente> obterClientes() {
        return mapaCliente.values();
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        mapaCliente = new HashMap<>();

        FileReader file = new FileReader("src/main/resources/static/cliente.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos;

        System.out.println("##########################");
        while (linha != null) {
            campos = linha.split(",");
            Cliente cliente = new Cliente(campos[0],
                    Integer.parseInt(campos[1]),
                    campos[2]);
            System.out.println("linha: " + linha);
            System.out.println(cliente);

            mapaCliente.put(cliente.getCpf(), cliente);

            linha = leitura.readLine();
        }

        for (Cliente cliente : mapaCliente.values()) {
            System.out.println(cliente);
        }

        System.out.println("##########################");
    }
}
