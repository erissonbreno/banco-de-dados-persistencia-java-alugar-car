package br.edu.infnet.aluguelVeiculo.repository;

import br.edu.infnet.aluguelVeiculo.model.Locacao;
import br.edu.infnet.aluguelVeiculo.model.Moto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocacaoRepository extends CrudRepository<Locacao,Integer> {
    @Query("from Locacao p where p.usuario.id = :userid")
    List<Locacao> obterLista(Integer userid);

}
