package com.herbalencyclopedia.HerbalEncyclopedia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TreePageController {

    @GetMapping("/addtree")
    public String showAddTreeForm(Model model) {
        return "add_tree";
    }
}
