package com.example.curso.webapp.springbootweb.controllers;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import com.example.curso.webapp.springbootweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Map<String, Object> model) {
        User user = new User("Gabo", "Restrepo");
        model.put("title", "Hello world S Boot");
        model.put("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String detailUsers(ModelMap model ) {
        //model.addAttribute("users", users); 
        model.addAttribute("title", "List of Users: ");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> userModel(){
        User user1 = new User("NameUser1", "LastName1");
        User user2 = new User("NameUser2", "LastName2", "example2@example.com");
        User user3 = new User("NameUser3", "LastName3");
        User user4 = new User("NameUser4", "LastName4");
        List<User> users = new ArrayList<>(List.of(user1,user2,user3,user4));
        return users;
    }
    
}
