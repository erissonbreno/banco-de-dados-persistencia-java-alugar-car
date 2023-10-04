package br.edu.infnet.aluguelVeiculo.repository;

import br.edu.infnet.aluguelVeiculo.model.Carro;
import br.edu.infnet.aluguelVeiculo.model.Cliente;
import br.edu.infnet.aluguelVeiculo.model.Moto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotoRepository extends CrudRepository<Moto,Integer> {
    @Query("from Moto m where m.usuario.id = :userid")
    List<Moto> obterLista(Integer userid);


}
