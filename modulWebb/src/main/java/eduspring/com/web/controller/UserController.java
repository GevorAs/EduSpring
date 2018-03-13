package eduspring.com.web.controller;

import eduspring.common.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {

    @GetMapping("/home")
    public String userHome(ModelMap map, @SessionAttribute("user")User user){
map.addAttribute("updateUser",user);
        return "home";
    }


    @PostMapping("/update")
    public String update(){

        return "home";
    }
}
