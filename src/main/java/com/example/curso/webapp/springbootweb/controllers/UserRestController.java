package com.example.curso.webapp.springbootweb.controllers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.example.curso.webapp.springbootweb.models.User;
import com.example.curso.webapp.springbootweb.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api") 
public class UserRestController {

    @RequestMapping(value="/details-dto", method = RequestMethod.GET)
    public Object detailsMap() {

        User user = new User("Gabriel", "Restrepo");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hello world Spring Boot");

        return userDto;
    }
    @GetMapping("search")
    public String getMethodName(@RequestParam(required = false) String param) {
        String result;
        result = param != null ? param : " Default";
        return new String("result" + result); 
    }

    @GetMapping("/list")
    public List<User> userList(){
        User user1 = new User("Gabriel", "Restrepo");
        User user2 = new User("John", "Smith");
        User user3 = new User("Petra", "Whick");
        User user4 = new User("Julian", "Porras");

        List<User> users = new ArrayList<>(List.of(user1,user2,user3,user4));
        return users; 
    }

    @GetMapping("/details-map")
    public Map<String, Object> details() {
        User user = new User("Gabo", "Restrepo");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hello world S Boot");
        body.put("user", user);
        return body;
    }
}
   