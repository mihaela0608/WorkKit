package bg.softuni.workkit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/about-us")
    public String aboutUs(){
        return "about-us";
    }
}
