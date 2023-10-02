package br.edu.infnet.aluguelVeiculo.controller;

import br.edu.infnet.aluguelVeiculo.model.Usuario;
import br.edu.infnet.aluguelVeiculo.service.UsuarioService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Setter
@SessionAttributes("user")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/usuario/lista")
    public String telaLista(Model model) {

        model.addAttribute("listaUsuario", usuarioService.obterLista());
        return "usuario/lista";
    }

    @GetMapping(value = "/usuario/cadastro")
    public String telaCasdastro() {
        return "usuario/cadastro";
    }

    @GetMapping(value = "/usuario/{cpf}/excluir")
    public String excluir(@PathVariable String email) {
        usuarioService.excluir(email);
        return "redirect:/usuario/lista";
    }

    @PostMapping(value = "/usuario/incluir")
    public String incluir(Usuario usuario) {
        usuarioService.incluir(usuario);
        return "redirect:/";
    }

    @PostMapping(value = "/valida")
    public String validar(Model model, @RequestParam String email, @RequestParam String senha) {
        Usuario user = usuarioService.validar(email, senha);

        if (usuarioService.validar(email, senha) != null) {
            model.addAttribute("user", user);
            return "home";
        }
        return "redirect:/login";
    }
}
