package br.edu.infnet.aluguelVeiculo.service;

import br.edu.infnet.aluguelVeiculo.model.Bicicleta;
import br.edu.infnet.aluguelVeiculo.model.Cliente;
import br.edu.infnet.aluguelVeiculo.model.Usuario;
import br.edu.infnet.aluguelVeiculo.repository.BicicletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BicicletaService {

    @Autowired
    private BicicletaRepository bicicletaRepository;

    public void incluir(Bicicleta bicicleta) {
        bicicletaRepository.save(bicicleta);
    }

    public void excluir(Integer id) {
        bicicletaRepository.deleteById(id);
    }

    public Collection<Bicicleta> obterLista() {
        return (Collection<Bicicleta>) bicicletaRepository.findAll();
    }

    public Collection<Bicicleta> obterLista(Usuario usuario) {
        return bicicletaRepository.obterLista(usuario.getId());
    }
}
