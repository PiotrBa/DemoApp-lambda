package org.piotrBa.controller;

import org.piotrBa.entity.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final List<Car> carList = List.of(
            new Car(1L, "Toyota", "Corolla", "Automatic", "Red", "2020"),
            new Car(2L, "Honda", "Civic", "Manual", "Blue", "2018"),
            new Car(3L, "Ford", "Focus", "Automatic", "Black", "2018"),
            new Car(4L, "BMW", "3 Series", "Automatic", "White", "2015"),
            new Car(5L, "Audi", "A4", "Manual", "Silver", "2002")
    );

    @GetMapping()
    public List<Car>getCars(){
        return carList;
    }
}
