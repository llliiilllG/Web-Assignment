package com.example.html.backend.service.impl;

import com.example.html.backend.entity.RegistrationEntity;
import com.example.html.backend.repository.LoginRepository;
import com.example.html.backend.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public boolean authenticateUser(String email, String password) {
        RegistrationEntity user = loginRepository.findByEmail(email);
        return user != null && user.getPassword().equals(password);
    }
}


