package web.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.CarService;


@Controller
@RequestMapping("/cars")
public class CarController {

	private final CarService carService;

	@Autowired
	public CarController(CarService carService) {
		this.carService = carService;
	}

	@GetMapping()
	public String getCar(@ModelAttribute("car") Car car,
						 @RequestParam(value = "count", required = false) Integer countCars,
						 Model model) {

		if (countCars != null) {
			model.addAttribute("cars", carService.selectedSomeCars(countCars));
		} else {
			model.addAttribute("cars", carService.getCarList());
		}
		return "cars";
	}

	@PostMapping()
	public String create(@ModelAttribute("car") @Valid Car car, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "cars";
		}
		carService.save(car);
		return "redirect:/cars";
	}
}