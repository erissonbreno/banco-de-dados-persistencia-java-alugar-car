package br.edu.infnet.aluguelVeiculo.repository;

import br.edu.infnet.aluguelVeiculo.model.Carro;
import br.edu.infnet.aluguelVeiculo.model.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarroRepository extends CrudRepository<Carro,Integer> {

    @Query("from Carro c where c.usuario.id = :userid")
    List<Carro> obterLista(Integer userid);

}
