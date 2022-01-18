package br.com.cdp.repository;

import br.com.cdp.model.Veiculo;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VeiculoRepository implements PanacheRepository<Veiculo> {

    public Veiculo findByName(String placa) {
        return find("placa", placa).firstResult();
    }
}
