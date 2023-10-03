package br.edu.infnet.aluguelVeiculo.model;

import br.edu.infnet.aluguelVeiculo.categoria.Categoria;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data @NoArgsConstructor
@Entity @Table
public class Bicicleta extends Veiculo{

    private String modelo;
    private boolean comCesta;
    private String cor;

    public Bicicleta(Integer id) {
        super(id);
    }

    public Bicicleta(String nome, double valor, Categoria categoria, String modelo, boolean comCesta, String cor) {
        super(nome, valor, categoria);
        this.modelo = modelo;
        this.comCesta = comCesta;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                super.toString() +
                ", modelo='" + modelo + '\'' +
                ", comCesta=" + comCesta +
                ", cor='" + cor + '\'' +
                '}';
    }
}
