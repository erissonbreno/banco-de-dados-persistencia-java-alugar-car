package br.edu.infnet.aluguelVeiculo.model;

import br.edu.infnet.aluguelVeiculo.categoria.Categoria;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Carro extends Veiculo {
    private String marca;
    private boolean eletrico;
    private int quilometragem;

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
