package br.com.alura.mvc.mudi.Repository;

import br.com.alura.mvc.mudi.Models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
