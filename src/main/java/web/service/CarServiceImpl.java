package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    public List<Car> selectedSomeCars(List<Car> carList, Integer count) {
        List<Car> selectedCarList = new ArrayList<>();
        count = (count >= carList.size() ? carList.size() : count);
        if ((count >= 0) && (count < 5)) {
            for (int i = 0; i < count; i++) {
                selectedCarList.add(carList.get(i));
            }
        } else {
            return carList;
        }
        return selectedCarList;
    }
}
