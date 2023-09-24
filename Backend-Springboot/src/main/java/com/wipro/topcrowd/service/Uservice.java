package com.wipro.topcrowd.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.topcrowd.model.User;
import com.wipro.topcrowd.repository.Urepository;

@Service
public class Uservice {

    @Autowired
    private Urepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
