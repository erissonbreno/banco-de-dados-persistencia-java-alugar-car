package br.edu.infnet.aluguelVeiculo.service;

import br.edu.infnet.aluguelVeiculo.model.Cliente;
import br.edu.infnet.aluguelVeiculo.model.Usuario;
import br.edu.infnet.aluguelVeiculo.model.Veiculo;
import br.edu.infnet.aluguelVeiculo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public void incluir(Veiculo veiculo) {
        veiculoRepository.save(veiculo);
    }

    public void excluir(Integer id) {
        veiculoRepository.deleteById(id);
    }

    public Collection<Veiculo> obterLista() {
        return (Collection<Veiculo>) veiculoRepository.findAll();
    }

    public Collection<Veiculo> obterLista(Usuario usuario) {
        return veiculoRepository.obterLista(usuario.getId());
    }
}
