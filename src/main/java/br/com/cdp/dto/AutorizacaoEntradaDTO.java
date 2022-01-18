package br.com.cdp.dto;

import br.com.cdp.model.*;

public class AutorizacaoEntradaDTO {

    private AutorizacaoEntradaSaida autorizacaoEntradaSaida;
    private ItemAutorizacao itemAutorizacao;
    private Motorista motorista;
    private Pesagem pesagem;
    private Pessoa pessoa;
    private Veiculo veiculo;

    public AutorizacaoEntradaDTO() {
    }

    public AutorizacaoEntradaSaida getAutorizacaoEntradaSaida() {
        return autorizacaoEntradaSaida;
    }

    public void setAutorizacaoEntradaSaida(AutorizacaoEntradaSaida autorizacaoEntradaSaida) {
        this.autorizacaoEntradaSaida = autorizacaoEntradaSaida;
    }

    public ItemAutorizacao getItemAutorizacao() {
        return itemAutorizacao;
    }

    public void setItemAutorizacao(ItemAutorizacao itemAutorizacao) {
        this.itemAutorizacao = itemAutorizacao;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Pesagem getPesagem() {
        return pesagem;
    }

    public void setPesagem(Pesagem pesagem) {
        this.pesagem = pesagem;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
