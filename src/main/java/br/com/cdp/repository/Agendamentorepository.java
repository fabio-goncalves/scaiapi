package br.com.cdp.repository;

import br.com.cdp.dto.AgendamentoDTO;
import br.com.cdp.model.Agendamento;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.util.Date;

public class Agendamentorepository implements PanacheRepository<Agendamento> {

    @Inject
    EntityManager em;

    public void inserirAgendamento(AgendamentoDTO agendamentoDTO) {
        StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery("pr_InserirAgendamento_New");
        storedProcedure.registerStoredProcedureParameter("@id_pessoa", Long.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@nsu_embarcacao", Long.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@dt_atracacao", Date.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@hr_atracacao", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@dt_desatracacao", Date.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@hr_desatracao", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@nsu_porto", Long.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@tp_navegacao", Long.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@nsu_carga", Long.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@cd_armazem", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@no_viagem", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@no_peso_previsto", Long.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@no_quantidade_previsto", Long.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@no_volume_previsto", Long.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@dt_atracacao_real", Date.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@dt_desatracacao_real", Date.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@hr_atracacao_real", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@hr_desatracacao_real", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@dt_fundeio", Date.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@dt_desfundeio", Date.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@hr_fundeio", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@hr_desfundeio", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@nsu_berco", Long.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@nsu_pessoa", Long.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@nm_usuario", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@nsu_tipo_operacao", Long.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@nsu_tipo_operacao_portuaria", Long.class, ParameterMode.IN);


        Agendamento agendamento = agendamentoDTO.getAgendamento();
        storedProcedure.setParameter("@id_pessoa", agendamento.getIdPessoa());
        storedProcedure.setParameter("@nsu_embarcacao", agendamento.getIdEmbarcacao());
        storedProcedure.setParameter("@dt_atracacao", agendamento.getDataPrevistaAtracacao());
        storedProcedure.setParameter("@hr_atracacao", agendamento.getHoraPrevistaDesatracacao());
        storedProcedure.setParameter("@dt_desatracacao", agendamento.getDataPrevistaDesatracacao());
        storedProcedure.setParameter("@hr_desatracao", agendamento.getHoraPrevistaDesatracacao());
        storedProcedure.setParameter("@nsu_porto", agendamento.getIdPorto());
        storedProcedure.setParameter("@tp_navegacao", agendamento.getIdTipoNavegacao());
        storedProcedure.setParameter("@nsu_carga", agendamento.getIdCarga());
        storedProcedure.setParameter("@cd_armazem", agendamento.getArmazem());
        storedProcedure.setParameter("@no_viagem", agendamento.getNumeroViagem());
        storedProcedure.setParameter("@no_peso_previsto", agendamento.getPesoPrevisto());
        storedProcedure.setParameter("@no_quantidade_previsto", agendamento.getQuantidadePrevista());
        storedProcedure.setParameter("@no_volume_previsto", agendamento.getVolumePrevisto());
        storedProcedure.setParameter("@dt_atracacao_real", agendamento.getHoraAtracacao());
        storedProcedure.setParameter("@dt_desatracacao_real", agendamento.getDataDesatracacao());
        storedProcedure.setParameter("@dt_fundeio", agendamento.getDataFundeio());
        storedProcedure.setParameter("@dt_desfundeio", agendamento.getDataDesfundeio());
        storedProcedure.setParameter("@hr_fundeio", agendamento.getHoraFundeio());
        storedProcedure.setParameter("@hr_desfundeio", agendamento.getHoraDesfundeio());
        storedProcedure.setParameter("@nsu_berco", agendamento.getIdBerco());
        storedProcedure.setParameter("@nsu_pessoa", agendamento.getIdPessoa());
        storedProcedure.setParameter("@nm_usuario", "Integração");
        storedProcedure.setParameter("@nsu_tipo_operacao", agendamento.getIdTipoOperacao());
        storedProcedure.setParameter("@nsu_tipo_operacao_portuaria", agendamento.getIdTipoOperacaoPortuaria());

    }
}
