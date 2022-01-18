package br.com.cdp.service;

import br.com.cdp.dto.AgendamentoDTO;
import br.com.cdp.repository.Agendamentorepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class AgendamentoService {

    @Inject
    private Agendamentorepository agendamentorepository;

    public String inserirAgendamento(AgendamentoDTO agendamentoDTO) {
        try {
            agendamentorepository.inserirAgendamento(agendamentoDTO);
            return "Agendamento realizado com sucesso";
        } catch (Exception e) {
            return "Erro na inserção do agendamento";
        }
    }
}
