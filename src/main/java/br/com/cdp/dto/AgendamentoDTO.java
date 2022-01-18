package br.com.cdp.dto;

import br.com.cdp.model.Agendamento;
import br.com.cdp.model.Usuario;

public class AgendamentoDTO {

    private Agendamento agendamento;
    private Usuario usuario;

    public AgendamentoDTO(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
