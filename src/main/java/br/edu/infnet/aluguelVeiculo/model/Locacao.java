package br.edu.infnet.aluguelVeiculo.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Data
public class Locacao {
    private String descricao;
    private LocalDateTime data;
    private List<Veiculo> veiculos;
    private Cliente cliente;

    public Locacao() {
        descricao = "Locacao inicial";
        data = LocalDateTime.now();
        veiculos = Collections.emptyList();
    }

    public Locacao(String descricao, LocalDateTime data, List<Veiculo> veiculos, Cliente cliente) {
        this.descricao = descricao;
        this.data = data;
        this.veiculos = veiculos;
        this.cliente = cliente;
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
