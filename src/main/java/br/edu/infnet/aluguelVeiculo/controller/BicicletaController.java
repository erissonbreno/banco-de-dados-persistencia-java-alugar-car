package br.edu.infnet.aluguelVeiculo.controller;

import br.edu.infnet.aluguelVeiculo.service.BicicletaService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Setter
public class BicicletaController {

    @Autowired
    private BicicletaService bicicletaService;

    @GetMapping(value = "/bicicleta/lista")
    public String telaLista(Model model) {
        model.addAttribute("listaBicicleta", bicicletaService.obterLista());
        return "bicicleta/lista";
    }

    @GetMapping(value = "/bicicleta/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        bicicletaService.excluir(id);
        return "redirect:/bicicleta/lista";
    }
}
