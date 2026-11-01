package com.example.curso.webapp.springbootweb.controllers;


import java.util.HashMap;
import java.util.Map;

import com.example.curso.webapp.springbootweb.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") 
public class UserRestController {

    @RequestMapping(value="/details", method = RequestMethod.GET)
    public Map<String, Object> details() {
        User user = new User("Gabo", "Restrepo");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hello world S Boot");
        body.put("user", user);
        return body;
    }
}
   