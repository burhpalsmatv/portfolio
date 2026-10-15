package org.portfolio.portfolio.controller;

import org.portfolio.portfolio.model.Vinyl;
import org.portfolio.portfolio.repository.VinylRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class PageController {
    @Autowired
    VinylRepo vinylRepo;

    @GetMapping("/index")
    public String mainPage(Model model) {
        return "index";
    }

    @GetMapping("/vinylLibrary")
    public String vinylLibrary(Model model) {
        List<Vinyl> vinylList;
        vinylList = vinylRepo.getAllVinyls();
        model.addAttribute("vinylList", vinylList);
        return "vinylLibrary";
    }
}
