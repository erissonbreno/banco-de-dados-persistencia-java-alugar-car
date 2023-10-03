package br.edu.infnet.aluguelVeiculo.controller;

import br.edu.infnet.aluguelVeiculo.model.Cliente;
import br.edu.infnet.aluguelVeiculo.service.CarroService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Setter
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping(value = "/carro/lista")
    public String telaLista(Model model) {
        model.addAttribute("listaCarro", carroService.obterLista());
        return "carro/lista";
    }

    @GetMapping(value = "/carro/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        carroService.excluir(id);
        return "redirect:/carro/lista";
    }
}
