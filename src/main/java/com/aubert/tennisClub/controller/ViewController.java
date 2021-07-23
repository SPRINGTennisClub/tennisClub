package com.aubert.tennisClub.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ViewController {
    @Value("${displayed-name}")
    private String displayedName;

    @GetMapping("clubInterface")
    public String clubInterface(Model model){
        model.addAttribute("applicationName",displayedName);
        return "clubInterface";
    }
}
