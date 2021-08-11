package br.com.alura.mvc.mudi.Repository;

import br.com.alura.mvc.mudi.Models.Pedido;
import br.com.alura.mvc.mudi.Models.StatutsPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

     List<Pedido> findByStatus(StatutsPedido status);
}
