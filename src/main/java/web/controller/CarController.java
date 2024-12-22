package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {

	List<Car> carList = new ArrayList<>();
	CarService carService = new CarServiceImpl();

	@GetMapping("/cars")
	public String getCar(Model model,
						 @ModelAttribute("car") Car car,
						 @RequestParam(value = "count", required = false) String countCars) {
		if (car.getBrand() != null && !car.getBrand().isEmpty() &&
				car.getSeries() != null && !car.getSeries().isEmpty() &&
				car.getCountry() != null && !car.getCountry().isEmpty()) {
			carList.add(car);
			model.addAttribute("showCarMSG", "The car added to the CAR LIST: " + car);
		}
		model.addAttribute("car", new Car());

		if (countCars != null && countCars != "") {
			Integer count = Integer.parseInt(countCars);
			List<Car> carShowList = carService.selectedSomeCars(carList, count);
			model.addAttribute("carList", carShowList);
		} else {
			model.addAttribute("carList", carList);
		}

		return "car/cars";
	}
}