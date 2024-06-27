package bg.softuni.workkit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/log-in")
    public String login(){
        return "log-in";
    }
    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
