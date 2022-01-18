package br.com.cdp.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "autorizacao_entrada_saida")
@Data
public class AutorizacaoEntradaSaida extends PanacheEntityBase {

    @Id
    @Column(name = "nsu_autorizacao_e_s")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autorizacao_generator")
    @SequenceGenerator(name = "autorizacao_generator", sequenceName = "autorizacao_seq", allocationSize = 50)
    private Long idAutorizacao;
    @Column(name = "nsu_embarque_desembarque")
    private Long idEmbarqueDesembarque;
    @Column(name = "nsu_veiculo")
    private Long idVeiculo;
    @Column(name = "nsu_pessoa")
    private Long idPessoa;
    @Column(name = "dt_previsao")
    private Date dataPrevisao;
    @Column(name = "dt_uso")
    private Date dataUso;
    @Column(name = "fl_gerou_etiqueta")
    private String gerouEtiqueta;
    @Column(name = "tp_entrada_saida")
    private String tipoEntradaSaida;


}
