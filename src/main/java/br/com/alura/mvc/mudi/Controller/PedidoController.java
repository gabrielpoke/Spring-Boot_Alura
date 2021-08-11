package br.com.alura.mvc.mudi.Controller;

import br.com.alura.mvc.mudi.DTO.RequsicaoNovoPedido;
import br.com.alura.mvc.mudi.Models.Pedido;
import br.com.alura.mvc.mudi.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("formulario")
    public String formulario(RequsicaoNovoPedido requsicaoNovoPedido){

        return "pedido/formulario";

    }

    @PostMapping("novo")
    public String novo(@Valid RequsicaoNovoPedido requsicaoNovoPedido, BindingResult result){

        if(result.hasErrors()){ return "pedido/formulario"; }

        Pedido pedido = requsicaoNovoPedido.toPedido();

        pedidoRepository.save(pedido);

        return "redirect:/home";
    }

}
