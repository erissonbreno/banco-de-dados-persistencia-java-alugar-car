package br.edu.infnet.aluguelVeiculo.repository;

import br.edu.infnet.aluguelVeiculo.model.Cliente;
import br.edu.infnet.aluguelVeiculo.model.Locacao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Integer> {
    @Query("from Cliente c where c.usuario.id = :userid")
    List<Cliente> obterLista(Integer userid);

}
