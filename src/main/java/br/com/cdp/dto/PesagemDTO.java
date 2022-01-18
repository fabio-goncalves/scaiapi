package br.com.cdp.dto;

import br.com.cdp.model.ItemPesagem;

public class PesagemDTO {

    private Long idAutorizacao;
    private String placa;
    private Long pesoBruto;

    public PesagemDTO() {
    }

    public Long getIdAutorizacao() {
        return idAutorizacao;
    }

    public void setIdAutorizacao(Long idAutorizacao) {
        this.idAutorizacao = idAutorizacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Long getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(Long pesoBruto) {
        this.pesoBruto = pesoBruto;
    }
}
