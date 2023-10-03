package br.edu.infnet.aluguelVeiculo.model;

import br.edu.infnet.aluguelVeiculo.categoria.Categoria;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data @NoArgsConstructor
@Entity @Table
public class Moto extends Veiculo{
    private String modelo;
    private boolean urbana;
    private String corCapacete;

    public Moto(String nome, double valor, Categoria categoria, String modelo, boolean urbana, String corCapacete) {
        super(nome, valor, categoria);
        this.modelo = modelo;
        this.urbana = urbana;
        this.corCapacete = corCapacete;
    }

    public Moto(Integer id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Moto{" +
                super.toString() +
                ", modelo='" + modelo + '\'' +
                ", urbana=" + urbana +
                ", corCapacete='" + corCapacete + '\'' +
                '}';
    }
}
