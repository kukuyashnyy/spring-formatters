package org.itstep.controller;

import org.itstep.controller.dto.DeliveryDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("deliveryDto", new DeliveryDto());
        return "index";
    }

    @PostMapping
    public String create(@Validated @ModelAttribute DeliveryDto deliveryDto,
                         BindingResult bindingResult) {
        System.out.println(deliveryDto);
        System.out.println(bindingResult);
        return "index";
    }

}
