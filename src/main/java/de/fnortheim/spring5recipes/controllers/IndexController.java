package de.fnortheim.spring5recipes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * created by sebastian on Apr, 2019
 */
@Controller
public class IndexController {

    @GetMapping({"", "/", "/index"})
    public String getIndexPage() {
        return "index";
    }
}
