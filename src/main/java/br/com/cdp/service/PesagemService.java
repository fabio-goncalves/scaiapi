package br.com.cdp.service;

import br.com.cdp.dto.PesagemDTO;
import br.com.cdp.model.ItemAutorizacao;
import br.com.cdp.model.ItemPesagem;
import br.com.cdp.model.Veiculo;
import br.com.cdp.repository.ItemAutorizacaoRepository;
import br.com.cdp.repository.PesagemRepository;
import br.com.cdp.repository.VeiculoRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Optional;

@ApplicationScoped
public class PesagemService {

    @Inject
    ItemAutorizacaoRepository itemAutorizacaoRepository;
    @Inject
    VeiculoRepository veiculoRepository;
    @Inject
    PesagemRepository pesagemRepository;

    public String inserirPesagem(PesagemDTO pesagemDTO) {
        Optional<ItemAutorizacao> itemAutorizacao = Optional.ofNullable(itemAutorizacaoRepository.findById(pesagemDTO.getIdAutorizacao()));
        Optional<ItemPesagem> itemPesagem = pesagemRepository.findByIdOptional(pesagemDTO.getIdAutorizacao()).stream().findFirst();
        if (!itemPesagem.isPresent()) {
            itemAutorizacao.ifPresent(item -> {
                Veiculo veiculo = veiculoRepository.findByName(pesagemDTO.getPlaca());
                Long pesoReal = calcularPesoReal(pesagemDTO.getPesoBruto(), veiculo.getTara());
                pesagemRepository.inserirItemPesagem(item.getIdAutorizacao(), item.getIdItem(), item.getIdSubItem(), pesoReal);

            });
            return "Atualizado!";
        } else
            return "Autorização já utilizada!";
    }

    private Long calcularPesoReal(Long pesoBruto, Long tara) {
        return pesoBruto - tara;
    }
}
