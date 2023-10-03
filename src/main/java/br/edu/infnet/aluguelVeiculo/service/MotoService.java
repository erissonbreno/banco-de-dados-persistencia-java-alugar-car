package br.edu.infnet.aluguelVeiculo.service;

import br.edu.infnet.aluguelVeiculo.model.Cliente;
import br.edu.infnet.aluguelVeiculo.model.Moto;
import br.edu.infnet.aluguelVeiculo.repository.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MotoService {

    @Autowired
    private MotoRepository motoRepository;

    public void incluir(Moto cliente) {
        motoRepository.save(cliente);

    }

    public void excluir(Integer id) {
        motoRepository.deleteById(id);
    }

    public Collection<Moto> obterLista() {
        return (Collection<Moto>) motoRepository.findAll();
    }
}
