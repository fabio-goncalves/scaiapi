package br.com.cdp.repository;

import br.com.cdp.model.AutorizacaoEntradaSaida;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AutorizacaoEntradaSaidaRepository implements PanacheRepository<AutorizacaoEntradaSaida> {
}
