package br.edu.infnet.aluguelVeiculo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data @NoArgsConstructor
@Entity @Table
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    @OneToMany
    @JoinColumn(name = "idUsuario")
    private List<Cliente> clientes;
    @OneToMany
    @JoinColumn(name = "idUsuario")
    private List<Veiculo> veiculos;
    @OneToMany
    @JoinColumn(name = "idUsuario")
    private List<Locacao> locacoes;
    public Usuario(Integer id) {
        this.id = id;
    }
}
