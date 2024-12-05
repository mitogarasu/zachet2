package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ThyTestController {
    @GetMapping("/ThyTest")
    public String thyTest(Model model) {
        String msg = "new text!";
        User myUser = new User();
        model.addAttribute("myUser", myUser);
        model.addAttribute("message", msg);
        return "index";
    }

    @PostMapping ("/ThyTest")
    public String thyTestPost(Model model, @ModelAttribute User myUser){

        User[] myUsers = {
                new User("Иван Иванов", "12wdwad34"),
                new User("Олег Петров", "567awdada8")
        };

        model.addAttribute("myUsers", myUsers);



        model.addAttribute("user_add", myUser);
        System.out.println("страница users");
        return "test";

//        model.addAttribute("myUserNew", myUser1);
//        System.out.println(myUser.getUsername());
//
//        return "test";
    }

}
