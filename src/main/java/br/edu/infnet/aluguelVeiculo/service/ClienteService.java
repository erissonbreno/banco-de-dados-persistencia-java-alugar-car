package br.edu.infnet.aluguelVeiculo.service;

import br.edu.infnet.aluguelVeiculo.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ClienteService {

    private Map<Integer, Cliente> mapaCliente  = new HashMap<>();

    public void incluir(Cliente cliente) {
        mapaCliente.put(cliente.getCpf(), cliente);

    }

    public void excluir(Integer cpf) {
        mapaCliente.remove(cpf);
    }

    public Collection<Cliente> obterLista() {
        return mapaCliente.values();
    }
}
