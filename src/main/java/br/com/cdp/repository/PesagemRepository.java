package br.com.cdp.repository;

import br.com.cdp.model.ItemPesagem;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

@ApplicationScoped
public class PesagemRepository implements PanacheRepository<ItemPesagem> {

    @Inject
    EntityManager em;

    //@NamedQuery(query="EXEC pr_Balanca_InserirItemPesagem @nsu_autorizacao_e_s = :idAutorizacao, @nsu_item_io = :idItem, @nsu_subitem_io = :idSubItem,@no_peso_real = :pesoReal")
    public void inserirItemPesagem(Long idAutorizacao, Long idItem, Long idSubItem, Long pesoReal) {
        StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery("pr_Balanca_InserirItemPesagem");
        storedProcedure.registerStoredProcedureParameter("@nsu_autorizacao_e_s", Long.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@nsu_item_io", Long.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@nsu_subitem_io", Long.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("@no_peso_real", Long.class, ParameterMode.IN);
        storedProcedure.setParameter("@nsu_autorizacao_e_s", idAutorizacao);
        storedProcedure.setParameter("@nsu_item_io", idItem);
        storedProcedure.setParameter("@nsu_subitem_io", idSubItem);
        storedProcedure.setParameter("@no_peso_real", pesoReal);
        storedProcedure.execute();
    }

}
