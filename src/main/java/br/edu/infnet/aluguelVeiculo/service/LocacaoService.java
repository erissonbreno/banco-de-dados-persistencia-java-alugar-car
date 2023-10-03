package br.edu.infnet.aluguelVeiculo.service;

import br.edu.infnet.aluguelVeiculo.model.Cliente;
import br.edu.infnet.aluguelVeiculo.model.Locacao;
import br.edu.infnet.aluguelVeiculo.model.Usuario;
import br.edu.infnet.aluguelVeiculo.repository.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LocacaoService {

    @Autowired
    private LocacaoRepository locacaoRepository;

    public void incluir(Locacao locacao) {
        locacaoRepository.save(locacao);
    }

    public void excluir(Integer id) {
        locacaoRepository.deleteById(id);
    }

    public Collection<Locacao> obterLista() {
        return (Collection<Locacao>) locacaoRepository.findAll();
    }

    public Collection<Locacao> obterLista(Usuario usuario) {
        return locacaoRepository.obterLista(usuario.getId());
    }
}
