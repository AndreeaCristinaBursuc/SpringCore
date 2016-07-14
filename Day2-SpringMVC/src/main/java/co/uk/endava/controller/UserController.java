package co.uk.endava.controller;

import co.uk.endava.controller.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by abursuc on 7/14/2016.
 */
@Controller
public class UserController {

        @RequestMapping(value = "", method = RequestMethod.GET)
        public ModelAndView initializeUser() {
            return new ModelAndView("UserForm", "SpringWeb", new User());
        }

       @RequestMapping(value = "/User", method = RequestMethod.POST)
        public String addUser(@ModelAttribute("SpringWeb")User user, ModelMap model) {
           System.out.println("Cevhfderhferui");
           System.out.println(user.getUsername());

            model.addAttribute("username", user.getUsername());
            model.addAttribute("password", user.getPassword());

            return "Result";
        }

}

