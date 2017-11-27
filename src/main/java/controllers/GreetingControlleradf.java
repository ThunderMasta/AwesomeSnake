package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/api/greeting")
public class GreetingControlleradf {
    @RequestMapping(method = GET)
    public @ResponseBody Message greeting() {
        return new Message();
    }
}