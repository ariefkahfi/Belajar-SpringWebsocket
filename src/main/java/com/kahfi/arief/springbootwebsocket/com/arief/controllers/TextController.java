package com.kahfi.arief.springbootwebsocket.com.arief.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/text")
public class TextController {

    @RequestMapping
    public String goToText(){
        return "text";
    }
}
