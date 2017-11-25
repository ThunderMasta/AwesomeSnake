package controllers;

import helpers.HelloWorldHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public String index(Model model)
    {
        model.addAttribute("greetingString", HelloWorldHelper.getMessage());

        return "index";
    }
}