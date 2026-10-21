package com.example.curso.webapp.springbootweb.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Map<String, Object> model) {
        model.put("title", "Hello world S Boot");
        model.put("firstName", "Gabo");
        model.put("lastName", "Restrepo");
        return "details";
    }
}
