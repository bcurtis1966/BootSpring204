package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/carbean")
    public String loadTvForm(Model model) {
        model.addAttribute("carbean", new CarBean());
        return "carbean";
    }

    @PostMapping("/carbean")
    public String processTvForm(@Valid CarBean carBean,
                                BindingResult result) {
        if (result.hasErrors()) {
            return "carbean";
        }
        return "carbeanconfirm";
    }
}