package service.impl;

import model.Car;
import org.springframework.stereotype.Service;
import service.CarService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> carList = List.of(
            new Car(1L, "1", "1"),
            new Car(2L, "1", "2"),
            new Car(3L, "1", "3"),
            new Car(4L, "1", "4"),
            new Car(5L, "1", "5")
    );

    @Override
    public List<Car> getAllCars() {
        return this.carList;
    }

    @Override
    public List<Car> getCarsCount(int count) {
        return this.carList.stream().limit(count).collect(Collectors.toList());
    }
}
