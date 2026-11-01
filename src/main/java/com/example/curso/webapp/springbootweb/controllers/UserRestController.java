package com.example.curso.webapp.springbootweb.controllers;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") 
public class UserRestController {

    @RequestMapping(value="/details", method = RequestMethod.GET)
    public Map<String, Object> details() {
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hello world S Boot");
        body.put("firstName", "Gabo");
        body.put("lastName", "Restrepo");
        return body;
    }
}
   