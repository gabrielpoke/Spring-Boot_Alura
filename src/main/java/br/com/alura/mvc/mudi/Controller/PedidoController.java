package br.com.alura.mvc.mudi.Controller;

import br.com.alura.mvc.mudi.DTO.RequsicaoNovoPedido;
import br.com.alura.mvc.mudi.Models.Pedido;
import br.com.alura.mvc.mudi.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("formulario")
    public String formulario(){

        return "pedido/formulario";

    }

    @PostMapping("novo")
    public String novo( RequsicaoNovoPedido requsicaoNovoPedido ){

        Pedido pedido = requsicaoNovoPedido.toPedido();

        pedidoRepository.save(pedido);

        return "pedido/formulario";
    }

}
