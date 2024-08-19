package com.example.html.backend.controller;

import com.example.html.backend.entity.CarBookingEntity;
import com.example.html.backend.pojo.CarBookingPojo;
import com.example.html.backend.service.CarBookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carbooking")
@RequiredArgsConstructor
public class CarBookingController {

    private final CarBookingService carBookingService;

    @PostMapping("/carbook")
    public void saveCarBookingBike(@RequestBody CarBookingPojo carBook) {
        carBookingService.saveCarBooking(carBook);
    }

    @GetMapping("/all")
    public List<CarBookingEntity> getAllCarBooking() {
        return carBookingService.getAllCarBooking();
    }

    @GetMapping("/all/{id}")
    public Optional<CarBookingEntity> getCarBookingById(@PathVariable Integer id) {
        return carBookingService.getCarBookingById(id);
    }
    @DeleteMapping("/all/{id}")
    public void deleteCarBooking(@PathVariable Integer id) {
        carBookingService.deleteCarBooking(id);
    }
}

