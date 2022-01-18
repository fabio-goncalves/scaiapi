package br.com.cdp.repository;

import br.com.cdp.model.ItemAutorizacao;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.jboss.resteasy.annotations.Query;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ItemAutorizacaoRepository implements PanacheRepository<ItemAutorizacao> {

}
