package pl.malek;

import java.util.ArrayList;
import java.util.List;

public class Rental {
    private List<Car> cars = new ArrayList<>();
    
    // CELOWY BŁĄD DLA PMD I CHECKSTYLE
    private int ZlaZmienna = 10; 

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }
}