package com.example.springportfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/index.html")
    public String indexPage2() {
        return "index";
    }

    @GetMapping("/cybersecurity.html")
    public String cyberPage() {
        return "cybersecurity";
    }

    @GetMapping("/development.html")
    public String devPage() {
        return "development";
    }

    @GetMapping("/uiux.html")
    public String uiPage() {
        return "uiux";
    }

    @GetMapping("/blog.html")
    public String blogPage() {
        return "blog";
    }

    @GetMapping("/contact.html")
    public String contactPage() {
        return "contact";
    }
}
