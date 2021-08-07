package br.com.alura.mvc.mudi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model){

        model.addAttribute("nomeProduto", "");
        model.addAttribute("valorEntrega","");
        model.addAttribute("dataEntrega","");
        model.addAttribute("urlProduto","");

        return "home";

    }
}
