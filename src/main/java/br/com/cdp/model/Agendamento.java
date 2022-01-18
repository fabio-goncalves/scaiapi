package br.com.cdp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "agendamento")
@Data
public class Agendamento {

    @Id
    @Column(name = "nsu_agedamento")
    private Long idAgedamento;
    @Column(name = "id_pessoa")
    private Long idPessoa;
    @Column(name = "nsu_embarcacao")
    private Long idEmbarcacao;
    @Column(name = "dt_atracacao")
    private Date dataPrevistaAtracacao;
    @Column(name = "dt_desatracacao")
    private Date dataPrevistaDesatracacao;
    @Column(name = "nsu_porto")
    private Long idPorto;
    @Column(name = "cd_armazem")
    private String armazem;
    @Column(name = "fl_status")
    private String status;
    @Column(name = "tp_navegacao")
    private Long idTipoNavegacao;
    @Column(name = "nsu_carga")
    private Long idCarga;
    @Column(name = "no_viagem")
    private String numeroViagem;
    @Column(name = "no_peso_previsto")
    private Long pesoPrevisto;
    @Column(name = "no_quantidade_previsto")
    private Long quantidadePrevista;
    @Column(name = "no_volume_previsto")
    private Long volumePrevisto;
    @Column(name = "no_container_previsto")
    private Long containerPrevisto;
    @Column(name = "hr_atracacao")
    private String horaPrevistaAtracacao;
    @Column(name = "hr_desatracacao")
    private String horaPrevistaDesatracacao;
    @Column(name = "dt_atracacao_real")
    private Date dataAtracacao;
    @Column(name = "dt_desatracacao_real")
    private Date dataDesatracacao;
    @Column(name = "hr_atracacao_real")
    private String horaAtracacao;
    @Column(name = "hr_desatracaco_real")
    private String horaDesatracacao;
    @Column(name = "dt_fundeio")
    private Date dataFundeio;
    @Column(name = "dt_desfundeio")
    private Date dataDesfundeio;
    @Column(name = "hr_fundeio")
    private String horaFundeio;
    @Column(name = "hr_desfundeio")
    private String horaDesfundeio;
    @Column(name = "dt_inicio_operacao")
    private Date inicioOperacao;
    @Column(name = "dt_fim_operacao")
    private Date fimOperacao;
    @Column(name = "hr_inicio_operacao")
    private String horaInicioOperacao;
    @Column(name = "hr_fim_operacao")
    private String horaFimOperacao;
    @Column(name = "nsu_tipo_operacao")
    private Long idTipoOperacao;
    @Column(name = "nsu_tipo_operacao_portuaria")
    private Long idTipoOperacaoPortuaria;
    @Column(name = "nsu_berco")
    private Long idBerco;
    @Column(name = "nsu_tipo_carga")
    private Long idTipoCarga;


}
