//package com.example.html.backend.service.impl;
//
//import com.example.html.backend.entity.CarRentalEntity;
//import com.example.html.backend.pojo.CarRentalPojo;
//import com.example.html.backend.repository.CarRentalRepository;
//import com.example.html.backend.service.CarRentalService;
//import com.example.html.backend.utils.ImageToBase64Car;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@Service
//@RequiredArgsConstructor
//public class CarRentalServiceImpl implements CarRentalService {
//
//    private final CarRentalRepository carRentalRepository;
//
//    private final String UPLOAD_DIRECTORY =System.getProperty("user.dir")+"/Carfile";
//
//    @Override
//    public void saveCarRental(CarRentalPojo carRentalPojo) throws IOException {
//        CarRentalEntity carRentalEntity = new CarRentalEntity();
//        carRentalEntity.setId(carRentalPojo.getId());
//        carRentalEntity.setCarBrand(carRentalPojo.getCarBrand());
//        carRentalEntity.setSeat(carRentalPojo.getSeat());
//        carRentalEntity.setPrice(carRentalPojo.getPrice());
//
//
//        if(carRentalPojo.getCarImage()!=null){
//            Path filesave= Paths.get(UPLOAD_DIRECTORY,carRentalPojo.getCarImage().getOriginalFilename());
//            Files.write(filesave,carRentalPojo.getCarImage().getBytes());
//            carRentalEntity.setCarImage(carRentalPojo.getCarImage().getOriginalFilename());
//        }
//        carRentalRepository.save(carRentalEntity);
//    }
//
//    @Override
//    public void updateCar(CarRentalPojo carRentalPojo) throws IOException {
//        Optional<CarRentalEntity> optionalCarRentalEntity = carRentalRepository.findById(carRentalPojo.getId());
//
//        if (optionalCarRentalEntity.isPresent()) {
//            CarRentalEntity carRentalEntity = optionalCarRentalEntity.get();
//            carRentalEntity.setCarBrand(carRentalPojo.getCarBrand());
//            carRentalEntity.setSeat(carRentalPojo.getSeat());
//            carRentalEntity.setPrice(carRentalPojo.getPrice());
//
//            if (carRentalPojo.getCarImage() != null) {
//                Path filesave = Paths.get(UPLOAD_DIRECTORY, carRentalPojo.getCarImage().getOriginalFilename());
//                Files.write(filesave, carRentalPojo.getCarImage().getBytes());
//                carRentalEntity.setCarImage(carRentalPojo.getCarImage().getOriginalFilename());
//            }
//            carRentalRepository.save(carRentalEntity);
//        } else {
//            throw new IllegalArgumentException("Car rental with ID " + carRentalPojo.getId() + " not found");
//        }
//    }
//
//    @Override
//    public List<CarRentalEntity> getAllCarRentals() {
//        ImageToBase64Car imageToBase64Car = new ImageToBase64Car();
//        List<CarRentalEntity> carRentalEntities = carRentalRepository.findAll();
//        carRentalEntities=carRentalEntities.stream().map(car->{
//            car.setCarImage(imageToBase64Car.getImageBase64(car.getCarImage()));
//            return car;
//        }).collect(Collectors.toList());
//        return carRentalEntities;
//    }
//
//    @Override
//    public Optional<CarRentalEntity> getCarRentalById(Integer id) {
//        return carRentalRepository.findById(id);
//    }
//
//    @Override
//    public void deleteCarRental(Integer id) {
//        carRentalRepository.deleteById(id);
//    }
//
//}













package com.example.html.backend.service.impl;

import com.example.html.backend.entity.CarRentalEntity;
import com.example.html.backend.pojo.CarRentalPojo;
import com.example.html.backend.repository.CarRentalRepository;
import com.example.html.backend.service.CarRentalService;
import com.example.html.backend.utils.ImageToBase64Car;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarRentalServiceImpl implements CarRentalService {

    private final CarRentalRepository carRentalRepository;

    private final String UPLOAD_DIRECTORY =System.getProperty("user.dir")+"/Carfile";

    @Override
    public void saveCarRental(CarRentalPojo carRentalPojo) throws IOException {
        CarRentalEntity carRentalEntity = new CarRentalEntity();
        carRentalEntity.setId(carRentalPojo.getId());
        carRentalEntity.setCarBrand(carRentalPojo.getCarBrand());
        carRentalEntity.setSeat(carRentalPojo.getSeat());
        carRentalEntity.setPrice(carRentalPojo.getPrice());


        if(carRentalPojo.getCarImage()!=null){
            Path filesave= Paths.get(UPLOAD_DIRECTORY,carRentalPojo.getCarImage().getOriginalFilename());
            Files.write(filesave,carRentalPojo.getCarImage().getBytes());
            carRentalEntity.setCarImage(carRentalPojo.getCarImage().getOriginalFilename());
        }
        carRentalRepository.save(carRentalEntity);
    }

    @Override
    public void updateCar(CarRentalPojo carRentalPojo) throws IOException {
        Optional<CarRentalEntity> optionalCarRentalEntity = carRentalRepository.findById(carRentalPojo.getId());

        if (optionalCarRentalEntity.isPresent()) {
            CarRentalEntity carRentalEntity = optionalCarRentalEntity.get();
            carRentalEntity.setCarBrand(carRentalPojo.getCarBrand());
            carRentalEntity.setSeat(carRentalPojo.getSeat());
            carRentalEntity.setPrice(carRentalPojo.getPrice());

            if (carRentalPojo.getCarImage() != null) {
                Path filesave = Paths.get(UPLOAD_DIRECTORY, carRentalPojo.getCarImage().getOriginalFilename());
                Files.write(filesave, carRentalPojo.getCarImage().getBytes());
                carRentalEntity.setCarImage(carRentalPojo.getCarImage().getOriginalFilename());
            }
            carRentalRepository.save(carRentalEntity);
        } else {
            throw new IllegalArgumentException("Car rental with ID " + carRentalPojo.getId() + " not found");
        }
    }

    @Override
    public List<CarRentalEntity> getAllCarRentals() {
        ImageToBase64Car imageToBase64Car = new ImageToBase64Car();
        List<CarRentalEntity> carRentalEntities = carRentalRepository.findAll();
        carRentalEntities=carRentalEntities.stream().map(car->{
            car.setCarImage(imageToBase64Car.getImageBase64(car.getCarImage()));
            return car;
        }).collect(Collectors.toList());
        return carRentalEntities;
    }

    @Override
    public Optional<CarRentalEntity> getCarRentalById(Integer id) {
        return carRentalRepository.findById(id);
    }

    @Override
    public void deleteCarRental(Integer id) {
        carRentalRepository.deleteById(id);
    }

}