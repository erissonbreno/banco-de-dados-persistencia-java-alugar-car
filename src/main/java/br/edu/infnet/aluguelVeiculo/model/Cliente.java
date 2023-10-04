package br.edu.infnet.aluguelVeiculo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data @NoArgsConstructor
@Entity
@Table
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private int cpf;
    private String email;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Cliente(String nome, int cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Cliente(Integer id) {
        this.id = id;
    }
}
