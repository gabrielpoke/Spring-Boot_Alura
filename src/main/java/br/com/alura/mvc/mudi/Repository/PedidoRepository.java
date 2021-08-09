package br.com.alura.mvc.mudi.Repository;

import br.com.alura.mvc.mudi.Models.Pedido;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PedidoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Pedido> reciperaTodosOsPedidos(){

        Query query = entityManager.createQuery("SELECT p FROM Pedido p", Pedido.class);
        return query.getResultList();

    }
}
