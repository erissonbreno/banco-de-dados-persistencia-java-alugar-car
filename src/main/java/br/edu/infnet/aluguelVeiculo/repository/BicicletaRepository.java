package br.edu.infnet.aluguelVeiculo.repository;

import br.edu.infnet.aluguelVeiculo.model.Bicicleta;
import br.edu.infnet.aluguelVeiculo.model.Carro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BicicletaRepository extends CrudRepository<Bicicleta,Integer> {

}
