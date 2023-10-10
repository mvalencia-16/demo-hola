package tin.demo.hola;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hola {
    
    @RequestMapping("/")
    public String holasaludo(){

        return "Hola a todos TIN";
    }
}
