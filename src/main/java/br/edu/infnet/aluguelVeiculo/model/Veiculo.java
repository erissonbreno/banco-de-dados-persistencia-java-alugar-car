package br.edu.infnet.aluguelVeiculo.model;

import br.edu.infnet.aluguelVeiculo.categoria.Categoria;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data @NoArgsConstructor
@Entity @Table
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Veiculo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private double valor;
    private Categoria categoria;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    @ManyToMany(mappedBy = "veiculos")
    private List<Locacao> locacao;

    public Veiculo(String nome, double valor, Categoria categoria) {
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
    }

    public Veiculo(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", categoria=" + categoria;
    }
}
