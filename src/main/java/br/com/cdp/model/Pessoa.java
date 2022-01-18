package br.com.cdp.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pessoa")
@Data
public class Pessoa {

    @Id
    @Column(name = "nsu_pessoa")
    private Long nsu_pessoa;
    @Column(name = "nm_pessoa")
    private String nome;
    @Column(name = "tp_documento")
    private String tipoDocumento;
    @Column(name = "nm_orgao_exp")
    private String orgaoExpeditor;
    @Column(name = "nm_estado_orgao")
    private String estadoOrgao;
    @Column(name = "no_documento")
    private String numeroDocumento;
    @Column(name = "id_pessoa")
    private int idPessoa;
    @Column(name = "nm_email")
    private String email;
    @Column(name = "dt_validade")
    private Date validade;
    @Column(name = "nsu_situacao")
    private Long status;
    @Column(name = "nivel_acesso")
    private String nivelAcesso;

}
