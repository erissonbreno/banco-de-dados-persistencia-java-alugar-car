package br.edu.infnet.aluguelVeiculo.controller;

import br.edu.infnet.aluguelVeiculo.ClienteLoader;
import br.edu.infnet.aluguelVeiculo.model.Cliente;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
@Setter
public class ClienteController {

    @Autowired
    private ClienteLoader clienteLoader;

    @GetMapping(value = "/cliente/lista")
    public String telaCliente(Model model) {

        model.addAttribute("listaCliente", clienteLoader.obterClientes());
        return "cliente/lista";
    }
}
