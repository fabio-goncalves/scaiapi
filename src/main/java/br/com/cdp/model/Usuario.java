package br.com.cdp.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {

    @Id
    @Column(name = "nsu_pessoa")
    private Long id;
    @Column(name = "nm_usuario")
    private String nome;
    @JsonIgnore
    @Column(name = "nm_password")
    private String password;

//
}
