package com.example.firstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class FirstController {

    @GetMapping("/hi")//hi는 URL 주소

    public String niceToMeetYou(Model model){
        model.addAttribute("username", "홍팍");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("username", "홍팍");
        return "goodbye";
    }
}
