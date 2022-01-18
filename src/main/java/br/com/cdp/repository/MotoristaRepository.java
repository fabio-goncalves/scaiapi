package br.com.cdp.repository;

import br.com.cdp.model.Motorista;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MotoristaRepository implements PanacheRepository<Motorista> {
}
