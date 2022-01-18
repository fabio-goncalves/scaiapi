package br.com.cdp.service;

import br.com.cdp.model.Veiculo;
import br.com.cdp.repository.VeiculoRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Optional;

@ApplicationScoped
public class PesoTaraService {

    @Inject
    VeiculoRepository veiculoRepository;

    public String atualizarTara(String placa, Long tara) {
        Optional<Veiculo> existsVeiculo = Optional.ofNullable(veiculoRepository.findByName(placa));
        existsVeiculo.ifPresent(veiculo -> veiculoRepository.update("update Veiculo v set v.tara = ?1 where v.id = ?2", tara, veiculo.getId()));
        return ("Tara atualizada com sucesso!");
    }
}
