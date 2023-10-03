package br.edu.infnet.aluguelVeiculo.controller;

import br.edu.infnet.aluguelVeiculo.service.VeiculoService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Setter
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping(value = "/veiculo/lista")
    public String telaLista(Model model) {

        model.addAttribute("listaVeiculo", veiculoService.obterLista());
        return "veiculo/lista";
    }

    @GetMapping(value = "/veiculo/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        veiculoService.excluir(id);
        return "redirect:/veiculo/lista";
    }
}
