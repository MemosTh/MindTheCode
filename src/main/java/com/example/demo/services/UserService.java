package com.example.demo.services;

import com.example.demo.UserMapper;
import com.example.demo.pojos.UserResponse;
import com.example.demo.pojos.Users;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRepository userRepository;

    public List<UserResponse> getAllUsers() {
        Iterable<Users> retrievedUsers = userRepository.findAll();
        List<UserResponse> users = new ArrayList<>();

        for (Users user : retrievedUsers) {
            users.add(userMapper.mapUsersResponse(user));
        }

        return users;
    }
}