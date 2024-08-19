//package com.example.html.backend.repository;
//
//import com.example.html.backend.entity.CarRentalEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface CarRentalRepository extends JpaRepository<CarRentalEntity, Integer> {
//}



package com.example.html.backend.repository;

import com.example.html.backend.entity.CarRentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRentalRepository extends JpaRepository<CarRentalEntity,Integer>{
        }