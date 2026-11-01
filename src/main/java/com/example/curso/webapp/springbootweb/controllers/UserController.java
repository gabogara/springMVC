package com.example.curso.webapp.springbootweb.controllers;

import java.util.Map;

import com.example.curso.webapp.springbootweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Map<String, Object> model) {
        User user = new User("Gabo", "Restrepo");
        model.put("title", "Hello world S Boot");
        model.put("user", user);
        return "details";
    }
}
