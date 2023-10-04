package br.edu.infnet.aluguelVeiculo.repository;

import br.edu.infnet.aluguelVeiculo.model.Bicicleta;
import br.edu.infnet.aluguelVeiculo.model.Carro;
import br.edu.infnet.aluguelVeiculo.model.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BicicletaRepository extends CrudRepository<Bicicleta,Integer> {

    @Query("from Bicicleta b where b.usuario.id = :userid")
    List<Bicicleta> obterLista(Integer userid);

}
