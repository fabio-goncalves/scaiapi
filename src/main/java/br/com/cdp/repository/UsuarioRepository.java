package br.com.cdp.repository;

import br.com.cdp.model.Usuario;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioRepository implements PanacheRepository<Usuario> {

    public Usuario findByName(String nome) {
        return find("nome", nome).firstResult();
    }

}
