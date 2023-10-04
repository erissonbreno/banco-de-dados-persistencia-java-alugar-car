package br.edu.infnet.aluguelVeiculo.service;

import br.edu.infnet.aluguelVeiculo.model.Cliente;
import br.edu.infnet.aluguelVeiculo.model.Usuario;
import br.edu.infnet.aluguelVeiculo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void incluir(Cliente cliente) {
        clienteRepository.save(cliente);

    }

    public void excluir(Integer id) {
        clienteRepository.deleteById(id);
    }

    public Collection<Cliente> obterLista() {
        return (Collection<Cliente>) clienteRepository.findAll();
    }

    public Collection<Cliente> obterLista(Usuario usuario) {
        return clienteRepository.obterLista(usuario.getId());
    }
}
