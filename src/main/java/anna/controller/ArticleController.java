package anna.controller;

import anna.model.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @PostMapping("/add")
    public String addArticle(@ModelAttribute Article formArticle, ModelMap modelMap){
        if (formArticle.checkNotEmpty()){
        modelMap.addAttribute("formArticle", formArticle);
        return "success";
    }else {
            return "redirect:sorry";
        }
        }

        @GetMapping("/sorry")
    public String sorry(){
            return "sorry";
        }
}
