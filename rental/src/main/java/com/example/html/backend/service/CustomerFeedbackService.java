package com.example.html.backend.service;

import com.example.html.backend.entity.CustomerFeedbackEntity;
import com.example.html.backend.pojo.CustomerFeedbackPojo;
import java.util.List;
import java.util.Optional;

public interface CustomerFeedbackService {
    void saveCustomerFeedback(CustomerFeedbackPojo customerFeedbackPojo);
    List<CustomerFeedbackEntity> getAllCustomerFeedback();
    Optional<CustomerFeedbackEntity> getCustomerFeedbackById(Integer id);
    void deleteCustomerFeedback(Integer id);
}
