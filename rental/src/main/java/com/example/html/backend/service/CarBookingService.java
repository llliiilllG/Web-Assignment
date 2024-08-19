package com.example.html.backend.service;

import com.example.html.backend.entity.CarBookingEntity;
import com.example.html.backend.pojo.CarBookingPojo;
import java.util.List;
import java.util.Optional;

public interface CarBookingService {
    void saveCarBooking(CarBookingPojo carBookingPojo);
    List<CarBookingEntity> getAllCarBooking();
    Optional<CarBookingEntity> getCarBookingById(Integer id);
    void deleteCarBooking(Integer id);
}
