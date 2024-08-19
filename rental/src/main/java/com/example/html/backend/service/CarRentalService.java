package com.example.html.backend.service;

import com.example.html.backend.entity.CarRentalEntity;
import com.example.html.backend.pojo.CarRentalPojo;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface CarRentalService {
    void saveCarRental(CarRentalPojo carRentalPojo) throws IOException;
    void updateCar(CarRentalPojo carRentalPojo) throws IOException;
    List<CarRentalEntity> getAllCarRentals();
    Optional<CarRentalEntity> getCarRentalById(Integer id);
    void deleteCarRental(Integer id);
}
