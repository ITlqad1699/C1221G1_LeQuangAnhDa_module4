package com.codegym.demo.service.impl;

import com.codegym.demo.model.User;
import com.codegym.demo.repository.IUserRepository;
import com.codegym.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    IUserRepository iUserRepository;
    @Override
    public void save(User user) {
        this.iUserRepository.save(user);
    }
}
