package br.edu.infnet.aluguelVeiculo.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Data
@Entity @Table
public class Locacao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private LocalDateTime data;
    @ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    private List<Veiculo> veiculos;
    @JoinColumn(name = "idCliente") @OneToOne(cascade = CascadeType.DETACH)
    private Cliente cliente;
    @ManyToOne @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Locacao() {
        descricao = "Locacao inicial";
        data = LocalDateTime.now();
        veiculos = Collections.emptyList();
    }

    public Locacao(String descricao, LocalDateTime data, List<Veiculo> veiculos, Usuario usuario) {
        this();
        this.descricao = descricao;
        this.data = data;
        this.veiculos = veiculos;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "descricao='" + descricao + '\'' +
                ", data=" + data +
                ", veiculos=" + veiculos +
                ", cliente=" + cliente +
                '}';
    }
}
