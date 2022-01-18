package br.com.cdp.resource;


import br.com.cdp.actions.CriptografarSenha;
import br.com.cdp.dto.LoginDTO;
import br.com.cdp.model.Usuario;
import br.com.cdp.security.TokenService;
import br.com.cdp.service.UsuarioService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Optional;

@Path("/scapapi")
@Consumes(MediaType.APPLICATION_JSON)
public class LoginResource {

    @Inject
    UsuarioService usuarioService;
    @Inject
    TokenService service;

    @GET
    @Path("/login")
    public Response login(LoginDTO loginDTO) throws UnsupportedEncodingException, NoSuchAlgorithmException {

        Optional<Usuario> usuario = Optional.ofNullable(usuarioService.findUser(loginDTO.getLogin()));

        if (usuario.isPresent() && usuario.get().getPassword().equals(CriptografarSenha.criptografaSenha(loginDTO.getPassword()).toUpperCase()))
            return Response.status(Response.Status.OK).entity(service.generateUserToken(loginDTO.getLogin(), loginDTO.getPassword())).build();

        return Response.status(Response.Status.UNAUTHORIZED)
                .entity("Usuário e/ou senha inválidos").build();

    }
}
