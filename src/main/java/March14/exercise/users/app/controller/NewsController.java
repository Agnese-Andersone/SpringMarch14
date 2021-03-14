package March14.exercise.users.app.controller;

import March14.exercise.users.app.model.News;
import March14.exercise.users.app.repository.NewsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/logged_in")
public class NewsController {
    private final NewsRepo newsRepo;

    @GetMapping()
    public String getNews(Model model){
        model.addAttribute("allNews", newsRepo.findAll());
        return "logged_in";
    }

    @PostMapping("/create")
    public String create(News news){
        newsRepo.save(news);
        return "redirect:/admin";
    }
}
