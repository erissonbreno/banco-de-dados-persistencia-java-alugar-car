package br.edu.infnet.aluguelVeiculo.repository;

import br.edu.infnet.aluguelVeiculo.model.Moto;
import br.edu.infnet.aluguelVeiculo.model.Veiculo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeiculoRepository extends CrudRepository<Veiculo,Integer> {
    @Query("from Veiculo v where v.usuario.id = :userid")
    List<Veiculo> obterLista(Integer userid);

}
