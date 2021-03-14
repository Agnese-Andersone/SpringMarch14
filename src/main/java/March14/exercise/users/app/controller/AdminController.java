package March14.exercise.users.app.controller;

import March14.exercise.users.app.model.News;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/admin")
    public String getIndex(Model model){
        model.addAttribute("newNews", new News());
        return "admin_page";
    }
}
