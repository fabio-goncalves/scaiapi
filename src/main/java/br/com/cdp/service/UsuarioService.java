package br.com.cdp.service;

import br.com.cdp.model.Usuario;
import br.com.cdp.repository.UsuarioRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class UsuarioService {

    @Inject
    UsuarioRepository usuarioRepository;

    public Usuario findUser(String nome) {
        return usuarioRepository.findByName(nome);
    }

}
