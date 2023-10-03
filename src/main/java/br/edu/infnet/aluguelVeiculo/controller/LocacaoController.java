package br.edu.infnet.aluguelVeiculo.controller;

import br.edu.infnet.aluguelVeiculo.service.LocacaoService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Setter
public class LocacaoController {

    @Autowired
    private LocacaoService locacaoService;

    @GetMapping(value = "/locacao/lista")
    public String telaLista(Model model) {
        model.addAttribute("listaLocacao", locacaoService.obterLista());
        return "locacao/lista";
    }

    @GetMapping(value = "/locacao/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        locacaoService.excluir(id);
        return "redirect:/locacao/lista";
    }
}
