package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String getCars(Model model, @RequestParam(name = "count", defaultValue = "5") int count) {
        List<Car> carList = carService.getAllCars();

        if (count < 5) {
            carList = carService.getCarsCount(count);
        }
        model.addAttribute("cars", carList);
        return "car";
    }


}
