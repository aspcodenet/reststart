package se.systementor.reststart.services;

import org.springframework.stereotype.Service;
import se.systementor.reststart.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private static ArrayList<Car> allCars;

    public List<Car> getAll(){
        return allCars;
    } 
}
