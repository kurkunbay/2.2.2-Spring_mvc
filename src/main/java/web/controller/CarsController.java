package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.CarService;
=======
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
>>>>>>> origin/master

@Controller
@RequestMapping("/cars")
public class CarsController {

<<<<<<< HEAD
    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

=======

private CarDAO carDAO;

@Autowired
public CarsController (CarDAO carDAO) {
    this.carDAO = carDAO;
}
>>>>>>> origin/master

    @GetMapping()
    public String index(Model model) {

<<<<<<< HEAD
        model.addAttribute("cars", carService.index());
        return "cars";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("cars", carService.show(id));
=======
        model.addAttribute("cars", carDAO.index());
        return "cars";
    }
    @GetMapping("/{id}")
    public String show(@PathVariable("id")int id,Model model) {
    model.addAttribute("cars", carDAO.show(id));
>>>>>>> origin/master
        return "cars";
    }
}
