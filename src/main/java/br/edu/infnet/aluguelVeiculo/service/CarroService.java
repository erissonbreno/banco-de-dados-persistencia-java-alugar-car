package br.edu.infnet.aluguelVeiculo.service;

import br.edu.infnet.aluguelVeiculo.model.Bicicleta;
import br.edu.infnet.aluguelVeiculo.model.Carro;
import br.edu.infnet.aluguelVeiculo.model.Cliente;
import br.edu.infnet.aluguelVeiculo.model.Usuario;
import br.edu.infnet.aluguelVeiculo.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public void incluir(Carro carro) {
        carroRepository.save(carro);

    }

    public void excluir(Integer id) {
        carroRepository.deleteById(id);
    }

    public Collection<Carro> obterLista() {
        return (Collection<Carro>) carroRepository.findAll();
    }

    public Collection<Carro> obterLista(Usuario usuario) {
        return carroRepository.obterLista(usuario.getId());
    }
}
