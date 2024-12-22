package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> selectedSomeCars(List<Car> carList, Integer count);
}
