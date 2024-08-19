package com.example.html.backend.repository;

import com.example.html.backend.entity.RegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationEntity, Integer> {
    RegistrationEntity findByEmail(String email);
}
