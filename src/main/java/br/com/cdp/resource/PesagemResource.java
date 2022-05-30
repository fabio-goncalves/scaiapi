package br.com.cdp.resource;

import br.com.cdp.dto.*;
import br.com.cdp.security.Roles;
import br.com.cdp.service.PesoTaraService;
import br.com.cdp.service.AutorizacaoService;
import br.com.cdp.service.PesagemService;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/scapapi")
@RolesAllowed({Roles.USER, Roles.SERVICE})
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ScapResource {

    @Inject
    AutorizacaoService autorizacaoService;
    @Inject
    PesoTaraService pesoTaraService;
    @Inject
    PesagemService pesagemService;

    @POST
    @Path("/register")
    public Response add(CadastroDTO cadastroDTO) {

        return Response.ok(cadastroDTO).build();

    }

    @GET
    @Path("/buscarAutorizacao")
    @RolesAllowed({Roles.USER, Roles.SERVICE})
    public Response findAE(AutorizacaoEntradaDTO autorizacaoEntradaDTO) {
        autorizacaoEntradaDTO = autorizacaoService.buscarAutorizacao(autorizacaoEntradaDTO.getAutorizacaoEntradaSaida().getIdAutorizacao());

        return Response.ok(autorizacaoEntradaDTO).build();
    }

    @POST
    @Path("/atualizarTara")
    @Transactional
    @RolesAllowed({Roles.USER, Roles.SERVICE})
    public Response atualizarTara(TaraDTO taraDTO) {
        String msg = pesoTaraService.atualizarTara(taraDTO.getPlaca(), taraDTO.getPeso());
        return Response.ok(msg).build();
    }

    @POST
    @Path("/inserirPesagem")
    @Transactional
    @RolesAllowed({Roles.USER, Roles.SERVICE})
    public Response inserirPesagem(PesagemDTO pesagemDTO) {
        String msg = pesagemService.inserirPesagem(pesagemDTO);
        return Response.ok(msg).build();
    }
}

