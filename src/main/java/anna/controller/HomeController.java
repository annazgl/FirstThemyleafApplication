package anna.controller;

import anna.model.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


    @GetMapping("/")
    public String home(ModelMap modelMap){
        modelMap.addAttribute("article", new Article());
        return "home";
    }

    @GetMapping("/if")
    public String ifMethod(ModelMap modelMap){
        modelMap.addAttribute("text", "sample text");
        modelMap.addAttribute("a", 123);
        modelMap.addAttribute("b", 456);
        return "if";
    }
}

