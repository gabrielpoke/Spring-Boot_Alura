package br.com.alura.mvc.mudi.Controller;

import br.com.alura.mvc.mudi.Models.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model){

        Pedido pedido = new Pedido();

        pedido.setNomeProduto(" PIKACHU ACTION FIGURE ");

        pedido.setDataDaEntrega(LocalDate.now());

        pedido.setUrlProduto("https://www.ebay.com/p/606526822?iid=293631670005");

        pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/71vc5ySs41L._AC_SL1500_.jpg");

        pedido.setDescricao(" PIKACHU EM FORMA DE BONECO ");

         List<Pedido> pedidos = Arrays.asList(pedido);

         model.addAttribute("pedidos", pedidos);

        return "home";

    }
}
