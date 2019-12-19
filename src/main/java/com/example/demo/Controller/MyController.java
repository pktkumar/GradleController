package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    // try to use localhost:8080/MyVal

    @RequestMapping("/MyVal")
    public  String newPage(){
        return "anypage";
    }


}
