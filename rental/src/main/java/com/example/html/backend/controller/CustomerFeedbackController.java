package com.example.html.backend.controller;

import com.example.html.backend.entity.CustomerFeedbackEntity;
import com.example.html.backend.pojo.CustomerFeedbackPojo;
import com.example.html.backend.service.CustomerFeedbackService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerFeedbackController {
    private final CustomerFeedbackService customerFeedbackService;

    @PostMapping("/feedback")
    public void customerFeedback(@RequestBody CustomerFeedbackPojo customerFeedback) {
        customerFeedbackService.saveCustomerFeedback(customerFeedback);
    }

    @GetMapping("/feedbacks")
    public List<CustomerFeedbackEntity> getAllCustomerFeedback() {
        return customerFeedbackService.getAllCustomerFeedback();
    }

    @GetMapping("/feedbacks/{id}")
    public Optional<CustomerFeedbackEntity> getCustomerFeedbackById(@PathVariable Integer id) {
        return customerFeedbackService.getCustomerFeedbackById(id);
    }

    @DeleteMapping("/feedbacks/{id}")
    public void deleteCustomerFeedback(@PathVariable Integer id) {
        customerFeedbackService.deleteCustomerFeedback(id);
    }
}
