package com.example.JenkinsCICDPipeline.service;

import com.example.JenkinsCICDPipeline.model.Users;
import com.example.JenkinsCICDPipeline.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Users> getAll() {
        List<Users> l = userRepository.findAll();
        System.out.println(l.get(0).getName());
        return userRepository.findAll();
    }

    public Users save(Users user) {
        return userRepository.save(user);
    }

    public void delete(String name) {
        userRepository.deleteByName(name);
    }
}
