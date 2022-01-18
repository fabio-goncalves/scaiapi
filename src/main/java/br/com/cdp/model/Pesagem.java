package br.com.cdp.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pesagem")
@Data
public class Pesagem {

    @Id
    @Column(name = "nsu_autorizacao_e_s")
    private Long id;
    @Column(name = "nsu_balanca")
    private Long balanca;
    @Column(name = "nsu_pesagem")
    private Long pesagem;
    @Column(name = "no_peso_bruto")
    private Float pesoBruto;
    @Column(name = "no_tara")
    private Float tara;
    @Column(name = "nm_placa")
    private String placa;
    @Column(name = "nm_placa_carreta")
    private String placaCarreta;
    @Column(name = "nota_fiscal")
    private String notaFiscal;
    @Column(name = "dt_pesagem1")
    private Date dataPesagemEntrada;
    @Column(name = "dt_pesagem2")
    private Date dataPesagemSaida;
    @Column(name = "nm_usuario1")
    private String usuario1;
    @Column(name = "nm_usuario2")
    private String usuario2;
    @Column(name = "ds_justificativa")
    private String justificativa;

}
