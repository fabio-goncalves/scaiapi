package br.com.cdp.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item_autorizacao")
@Data
public class ItemAutorizacao extends PanacheEntityBase {

    @Id
    @Column(name = "nsu_autorizacao_e_s")
    private Long idAutorizacao;
    @Column(name = "nsu_item_io")
    private Long idItem;
    @Column(name = "nsu_subitem_io")
    private Long idSubItem;
    @Column(name = "no_volume")
    private Long volume;
    @Column(name = "no_quantidade")
    private Integer quantidade;
    @Column(name = "no_peso")
    private Long peso;
    @Column(name = "no_peso_real")
    private Long pesoReal;

}
