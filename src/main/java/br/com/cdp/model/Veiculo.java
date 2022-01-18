package br.com.cdp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "veiculo")
@Data
public class Veiculo {

    @Id
    @Column(name = "nsu_veiculo")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "veiculo_generator")
    @SequenceGenerator(name = "veiculo_generator", sequenceName = "veiculo_seq", allocationSize = 50)
    private Long id;
    @Column(name = "nm_marca")
    private String marca;
    @Column(name = "nm_placa")
    private String placa;
    @Column(name = "nm_uf_placa")
    private String ufPlaca;
    @Column(name = "dt_liberacao")
    private Date dtLiberacao;
    @Column(name = "dt_entrada")
    private Date dtEntrada;
    @Column(name = "dt_validade_vistoria")
    private Date dtVistoria;
    @Column(name = "no_tara")
    private Long tara;

}
