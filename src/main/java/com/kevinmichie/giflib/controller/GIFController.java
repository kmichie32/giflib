package com.kevinmichie.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GIFController {
    @RequestMapping(value = "/")
    public String listGifs(){
        return "home";
    }


}

