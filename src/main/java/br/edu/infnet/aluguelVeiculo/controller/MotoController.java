package br.edu.infnet.aluguelVeiculo.controller;

import br.edu.infnet.aluguelVeiculo.model.Usuario;
import br.edu.infnet.aluguelVeiculo.service.MotoService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@Setter
public class MotoController {

    @Autowired
    private MotoService motoService;

    @GetMapping(value = "/moto/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("listaMoto", motoService.obterLista(usuario));
        return "moto/lista";
    }

    @GetMapping(value = "/moto/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        motoService.excluir(id);
        return "redirect:/moto/lista";
    }
}
