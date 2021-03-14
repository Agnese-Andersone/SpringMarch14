package March14.exercise.users.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @GetMapping("/unauthorized")
    public String getAccessDenied(){
        return "unauthorized";
    }
}
