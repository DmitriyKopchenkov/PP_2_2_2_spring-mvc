package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    @Autowired
    private CarService service;

    @GetMapping("/cars")
    public String prinCarTable(@RequestParam(defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", service.getListCar(count));
        return "cars";
    }
}
