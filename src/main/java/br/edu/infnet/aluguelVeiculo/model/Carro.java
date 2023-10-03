package br.edu.infnet.aluguelVeiculo.model;

import br.edu.infnet.aluguelVeiculo.categoria.Categoria;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data @NoArgsConstructor
@Entity @Table
public class Carro extends Veiculo {
    private String marca;
    private boolean eletrico;
    private int quilometragem;

    public Carro(Integer id) {
        super(id);
    }

    public Carro(String nome, double valor, Categoria categoria, String marca, boolean eletrico, int quilometragem) {
        super(nome, valor, categoria);
        this.marca = marca;
        this.eletrico = eletrico;
        this.quilometragem = quilometragem;
    }

    @Override
    public String toString() {
        return "Carro{" +
                super.toString() +
                ", marca='" + marca + '\'' +
                ", eletrico=" + eletrico +
                ", quilometragem=" + quilometragem +
                '}';
    }
}
