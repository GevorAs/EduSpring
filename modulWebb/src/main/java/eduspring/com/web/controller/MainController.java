package eduspring.com.web.controller;

import eduspring.com.web.security.CurrentUser;
import eduspring.common.model.User;
import eduspring.common.model.UserType;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class MainController {


    @GetMapping("/")
    public String home(){
        return "index";
    }


    @GetMapping("/loginSuccess")
    public String login(ModelMap map){
        CurrentUser principal = (CurrentUser)
                SecurityContextHolder.
                        getContext().
                        getAuthentication()
                        .getPrincipal();

        User user = principal.getUser();
        user.setPassword(null);
        if (user.getUserType() == UserType.MANAGER) {

            map.addAttribute("user", user);

            return "redirect:/manager/managerPage";

        } else if (user.getUserType() == UserType.USER) {
            map.addAttribute("user", user);
            return "redirect:/user/home";

        }
        return "redirect:/";
    }
}
