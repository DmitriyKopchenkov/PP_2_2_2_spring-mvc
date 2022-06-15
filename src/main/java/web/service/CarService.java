package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    List<Car> carList = new ArrayList<>(Arrays.asList(
            new Car("Pontiac", "GTO", 1967),
            new Car("Lincoln", "Continental", 1973),
            new Car("Dodge", "Charger", 1969),
            new Car("Chevrolette", "Chevelle", 1969),
            new Car("Mercedes-Benz", "300SL", 1957)));

    public List<Car> getListCar(int count) {
        if (count < 5 && count > 0) {
            carList = carList.subList(0, count);
        }
        return carList;
    }
}
