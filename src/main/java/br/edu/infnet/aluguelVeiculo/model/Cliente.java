package br.edu.infnet.aluguelVeiculo.model;

import lombok.Data;

@Data
public class Cliente {
    private String nome;
    private int cpf;
    private String email;

    public Cliente(String nome, int cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", email='" + email + '\'' +
                '}';
    }
}
