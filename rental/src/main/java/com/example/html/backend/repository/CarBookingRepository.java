package com.example.html.backend.repository;

import com.example.html.backend.entity.CarBookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarBookingRepository extends JpaRepository<CarBookingEntity, Integer> {

}
