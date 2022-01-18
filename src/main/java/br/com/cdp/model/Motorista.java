package br.com.cdp.model;

import lombok.Data;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;

@Entity
@Table(name = "motorista")
@Data
public class Motorista {

    @Id
    @Column(name = "nsu_pessoa")
    private Long nsu_pessoa;
    @Column(name = "no_cracha")
    private Long cracha;
    @Column(name = "no_cpf")
    private String cpf;
    @Column(name = "no_cnh")
    private String cnh;

}
