package org.example.javaweb.controllers;

import org.example.javaweb.model.DogRepository;
import org.example.javaweb.model.VapeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController  {
    @Autowired
    //DogRepository dogRepository;
    VapeRepository vapeRepository;

    @GetMapping(path="/")
    String empty(Model model)
    {
        model.addAttribute("activeFunction", "home");

        model.addAttribute("vapeproducts", vapeRepository.findAll());
        return "vapeproducts";
    }
    @GetMapping(path="/list")
    String list(Model model)
    {
        model.addAttribute("activeFunction", "home");

        model.addAttribute("vapeproducts", vapeRepository.findAll());
        return "list";
    }


//    @GetMapping(path="/dogs")
//    String dogList(Model model)
//    {
//        model.addAttribute("activeFunction", "home");
//
//        model.addAttribute("vapeproducts", dogRepository.findAll());
//        return "vapeproducts";
//    }


}
