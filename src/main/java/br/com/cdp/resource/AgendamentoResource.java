package br.com.cdp.resource;

import br.com.cdp.dto.AgendamentoDTO;
import br.com.cdp.security.Roles;
import br.com.cdp.service.AgendamentoService;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/scapapi")
@RolesAllowed({Roles.USER, Roles.SERVICE})
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AgendamentoResource {

    @Inject
    private AgendamentoService agendamentoService;

    @POST
    @Path("/inserirAgendamento")
    public Response inserirAgendamento(AgendamentoDTO agendamentoDTO) {
        String msg = agendamentoService.inserirAgendamento(agendamentoDTO);
        return Response.ok(msg).build();

    }
}
