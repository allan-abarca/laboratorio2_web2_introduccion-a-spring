package tecnicotec.laboratorio_2allan_abarca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SolidController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/s")
    public String principioS() {
        return "s";
    }

    @GetMapping("/o")
    public String principioO() {
        return "o";
    }

    @GetMapping("/l")
    public String principioL() {
        return "l";
    }

    @GetMapping("/i")
    public String principioI() {
        return "i";
    }

    @GetMapping("/d")
    public String principioD() {
        return "d";
    }
}
