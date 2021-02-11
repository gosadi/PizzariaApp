package pizzeria.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/") //This will be inherited from all the methods of the controller
public class HomeController {
    
    @RequestMapping("/")
    public String showHome(Model model){
        return "home";
    }
    
}
