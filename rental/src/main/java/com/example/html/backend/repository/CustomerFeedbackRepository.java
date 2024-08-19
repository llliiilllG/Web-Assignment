package com.example.html.backend.repository;

import com.example.html.backend.entity.CustomerFeedbackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerFeedbackRepository extends JpaRepository<CustomerFeedbackEntity, Integer> {
}
