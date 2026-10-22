package org.portfolio.portfolio.controller;

import org.portfolio.portfolio.model.Vinyl;
import org.portfolio.portfolio.repository.VinylRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VinylController {

    @Autowired
    VinylRepo vinylRepo;


    @GetMapping("/showVinyl")
    public String showVinyl(@RequestParam("id")int id, Model model) {
        Vinyl vinyl = vinylRepo.getVinylId(id);
        model.addAttribute(vinyl);
        return "vinyl";
    }
}
