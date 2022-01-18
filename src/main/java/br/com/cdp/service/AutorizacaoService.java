package br.com.cdp.service;

import br.com.cdp.dto.AutorizacaoEntradaDTO;
import br.com.cdp.model.*;
import br.com.cdp.repository.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class AutorizacaoService {

    @Inject
    AutorizacaoEntradaSaidaRepository autorizacaoEntradaSaidaRepository;
    @Inject
    ItemAutorizacaoRepository itemAutorizacaoRepository;
    @Inject
    MotoristaRepository motoristaRepository;
    @Inject
    PessoaRepository pessoaRepository;
    @Inject
    VeiculoRepository veiculoRepository;

    public AutorizacaoEntradaDTO buscarAutorizacao(Long id) {

        AutorizacaoEntradaSaida autorizacaoEntradaSaida = autorizacaoEntradaSaidaRepository.findById(id);
        AutorizacaoEntradaDTO autorizacaoEntradaDTO = new AutorizacaoEntradaDTO();
        Motorista motorista = motoristaRepository.findById(autorizacaoEntradaSaida.getIdPessoa());
        Pessoa pessoa = pessoaRepository.findById(autorizacaoEntradaSaida.getIdPessoa());
        Veiculo veiculo = veiculoRepository.findById(autorizacaoEntradaSaida.getIdVeiculo());
        ItemAutorizacao itemAutorizacao = itemAutorizacaoRepository.findById(id);
        autorizacaoEntradaDTO.setAutorizacaoEntradaSaida(autorizacaoEntradaSaida);
        autorizacaoEntradaDTO.setItemAutorizacao(itemAutorizacao);
        autorizacaoEntradaDTO.setMotorista(motorista);
        autorizacaoEntradaDTO.setPessoa(pessoa);
        autorizacaoEntradaDTO.setVeiculo(veiculo);

        return autorizacaoEntradaDTO;
    }

}
