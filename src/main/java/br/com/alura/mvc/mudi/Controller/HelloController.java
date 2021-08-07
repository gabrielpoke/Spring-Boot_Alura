package br.com.alura.mvc.mudi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model request){

        request.addAttribute("nome", "Gabriel");
        return "hello";
    }
}
