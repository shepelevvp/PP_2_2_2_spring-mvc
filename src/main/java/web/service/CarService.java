package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    void save (Car car);
    List<Car> getCarList();
    List<Car> selectedSomeCars(Integer count);
}
