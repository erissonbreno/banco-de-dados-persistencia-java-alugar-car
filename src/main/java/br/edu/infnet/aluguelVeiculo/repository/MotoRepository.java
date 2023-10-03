package br.edu.infnet.aluguelVeiculo.repository;

import br.edu.infnet.aluguelVeiculo.model.Carro;
import br.edu.infnet.aluguelVeiculo.model.Moto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoRepository extends CrudRepository<Moto,Integer> {

}
