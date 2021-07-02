package com.example.batch9.service;


import com.example.batch9.entity.User;
import com.example.batch9.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> saveUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserByCompanyId(int companyId) {
        return userRepository.findByCompanyId(companyId);
    }

    public User getUserByName(String name) {
        return userRepository.findByName(name);
    }

    public String deleteUser(int id) {
        userRepository.deleteById(id);
        return "Sidhiek love pak Dewa";
    }

    public User updateUser(User user) {
        User existUser = userRepository.findById(user.getId()).orElse(null);
        existUser.setName(user.getName());
        existUser.setEmail(user.getEmail()); existUser.setCompany_id(user.getCompany_id());
        existUser.setInstagram(user.getInstagram());
        return userRepository.save(existUser);
    }
}
