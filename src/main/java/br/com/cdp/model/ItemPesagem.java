package br.com.cdp.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item_pesagem")
@Data
public class ItemPesagem {

    @Id
    @Column(name = "nsu_autorizacao_e_s")
    private Long idAutorizacao;
    @Column(name = "nsu_item_io")
    private Long idItem;
    @Column(name = "nsu_subitem_io")
    private Long idSubItem;
    @Column(name = "no_peso_real")
    private Long pesoReal;

}
