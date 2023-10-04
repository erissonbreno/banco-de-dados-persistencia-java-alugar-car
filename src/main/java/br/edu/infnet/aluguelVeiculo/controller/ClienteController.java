package br.edu.infnet.aluguelVeiculo.controller;

import br.edu.infnet.aluguelVeiculo.model.Cliente;
import br.edu.infnet.aluguelVeiculo.model.Usuario;
import br.edu.infnet.aluguelVeiculo.service.ClienteService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@Setter
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/cliente/lista")
    public String telaCliente(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("listaCliente", clienteService.obterLista(usuario));
        return "cliente/lista";
    }

    @GetMapping(value = "/cliente/cadastro")
    public String telaCadastro() {

        return "cliente/cadastro";
    }

    @PostMapping(value = "/cliente/incluir")
    public String incluir(Cliente cliente, @SessionAttribute("user") Usuario usuario) {
        cliente.setUsuario(usuario);
        clienteService.incluir(cliente);
        return "redirect:/cliente/lista";
    }

    @GetMapping(value = "/cliente/{cpf}/excluir")
    public String excluir(@PathVariable Integer cpf) {
        clienteService.excluir(cpf);
        return "redirect:/cliente/lista";
    }
}
