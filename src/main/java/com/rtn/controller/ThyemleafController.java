package com.rtn.controller;

import com.rtn.model.rtn;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThyemleafController {

    @GetMapping("/home")
    public String home(Model model){
        rtn r = new rtn();

        r.setId(1);
        r.setName("123");
        model.addAttribute("myrtn",r);

        return "index";
    }
}
