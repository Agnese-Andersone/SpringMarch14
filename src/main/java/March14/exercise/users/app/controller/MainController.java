package March14.exercise.users.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping
    public String getIndex(){
        return "index";

    }
    @GetMapping("/logged_in")
    public String getLoggedIn(){
        return "logged_in";
    }


}
