package br.edu.infnet.aluguelVeiculo.controller;

import br.edu.infnet.aluguelVeiculo.ClienteLoader;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Setter
public class MotoController {

//    @Autowired
//    private ClienteLoader clienteLoader;
//
//    @GetMapping(value = "/cliente/lista")
//    public String telaCliente(Model model) {
//
////        model.addAttribute("listaCliente", clienteLoader.obterLista());
//        return "cliente/lista";
//    }
}
