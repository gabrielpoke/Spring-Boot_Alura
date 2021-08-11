package br.com.alura.mvc.mudi.Controller;

import br.com.alura.mvc.mudi.Models.Pedido;
import br.com.alura.mvc.mudi.Models.StatutsPedido;
import br.com.alura.mvc.mudi.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public ModelAndView home(){

        List<Pedido> pedidos = pedidoRepository.findAll();

        ModelAndView model = new ModelAndView();
         model.addObject("pedidos", pedidos);

        return model;
    }

    @GetMapping("/{status}")
    public String status(@PathVariable("status") String status, Model model){

        List<Pedido> pedidos = pedidoRepository.findByStatus(StatutsPedido.valueOf(status.toUpperCase()));

        model.addAttribute("pedidos", pedidos);
        model.addAttribute("status",status);

        return "home";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String onError(){
        return "redirect:/home";
    }

}
