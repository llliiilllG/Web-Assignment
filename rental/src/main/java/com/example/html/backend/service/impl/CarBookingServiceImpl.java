package com.example.html.backend.service.impl;

import com.example.html.backend.entity.CarBookingEntity;
import com.example.html.backend.entity.CarRentalEntity;
import com.example.html.backend.entity.RegistrationEntity;
import com.example.html.backend.pojo.CarBookingPojo;
import com.example.html.backend.repository.CarBookingRepository;
import com.example.html.backend.repository.CarRentalRepository;
import com.example.html.backend.repository.RegistrationRepository;
import com.example.html.backend.service.CarBookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarBookingServiceImpl implements CarBookingService {

    private final CarBookingRepository carBookingRepository;

    private final CarRentalRepository carRentalRepository;

    private final RegistrationRepository registrationRepository;



    @Override
    public void saveCarBooking(CarBookingPojo carBookingPojo) {
        CarBookingEntity carBookingEntity = new CarBookingEntity();
         CarRentalEntity carRentalEntity = carRentalRepository.findById(carBookingPojo.getCarId()).orElse(null);
        RegistrationEntity registrationEntity = registrationRepository.findById(carBookingPojo.getUserId()).orElse(null);
        carBookingEntity.setTotalAmount(carBookingPojo.getTotalAmount());

    if (carRentalEntity != null && registrationEntity != null) {
        carBookingEntity.setCar_Adding(carRentalEntity);
        carBookingEntity.setRegistration(registrationEntity);
    }
            carBookingEntity.setRentalStartdateTime(carBookingPojo.getRentalStartdateTime());
            carBookingEntity.setRentalEnddateTime(carBookingPojo.getRentalEnddateTime());


            carBookingRepository.save(carBookingEntity);
    }

    @Override
    public List<CarBookingEntity> getAllCarBooking() {

        return carBookingRepository.findAll();
    }

    @Override
    public Optional<CarBookingEntity> getCarBookingById(Integer id) {

        return carBookingRepository.findById(id);
    }

    @Override
    public void deleteCarBooking(Integer id) {

        carBookingRepository.deleteById(id);
    }

}

