package br.edu.infnet.aluguelVeiculo.service;

import br.edu.infnet.aluguelVeiculo.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UsuarioService {

    private Map<String, Usuario> mapaUsuario = new HashMap<>();

    public void incluir(Usuario usuario) {
        mapaUsuario.put(usuario.getEmail(), usuario);
        System.out.println(usuario);

    }

    public void excluir(String cpf) {
        mapaUsuario.remove(cpf);
    }

    public Collection<Usuario> obterLista() {
        return mapaUsuario.values();
    }

    public Usuario validar(String email, String senha) {
        Usuario usuario = mapaUsuario.get(email);

        if (usuario != null) {
            if (usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }
        return null;
    }
}
