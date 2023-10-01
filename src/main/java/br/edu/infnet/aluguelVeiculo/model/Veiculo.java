package br.edu.infnet.aluguelVeiculo.model;

import br.edu.infnet.aluguelVeiculo.categoria.Categoria;

public abstract class Veiculo {
    private String nome;
    private double valor;
    private Categoria categoria;

    public Veiculo() {
    }

    public Veiculo(String nome, double valor, Categoria categoria) {
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", categoria=" + categoria;
    }
}
