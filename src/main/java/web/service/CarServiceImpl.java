package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car("AUDI","A5", "Germany"));
        carList.add(new Car("Reno","Sandero", "France"));
        carList.add(new Car("Huyndai","Getz", "Korean"));
        carList.add(new Car("Lada","Vesta", "Russia"));
        carList.add(new Car("Ford","Focus", "USA"));

    }

    public List<Car> getCarList() {
        return carList;
    }

    public void save (Car car) {
        carList.add(car);
    }

    public List<Car> selectedSomeCars(Integer count) {
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
