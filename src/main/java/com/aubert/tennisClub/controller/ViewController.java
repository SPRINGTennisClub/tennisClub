package com.aubert.tennisClub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ViewController {
    @GetMapping("clubInterface")
    public String clubInterface(){
        return "clubInterface";
    }
}
