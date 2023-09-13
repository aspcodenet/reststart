package se.systementor.reststart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import se.systementor.reststart.models.Car;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import se.systementor.reststart.services.CarService;

@RestController
public class AuctionController {
    @Autowired
    CarService carService;

    @GetMapping("/api/auctions")
    public List<Car> getAuctions(){
        return new ArrayList<>();
    }
}
