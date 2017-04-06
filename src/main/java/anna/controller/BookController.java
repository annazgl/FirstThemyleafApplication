package anna.controller;

import anna.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class BookController {

    @GetMapping("/bookadd")
    public String addBook(){
        return"book/index";

    }

    @GetMapping("/loop")
    public String listBooks(ModelMap modelMap){
        modelMap.addAttribute("book",Arrays.asList(new Book("Książka1", "Author1", 59.99),
                new Book("Książka2", "Author2", 69.99),new Book("Książka3", "Author3", 79.99)));
    return "book/loop";
    }
}