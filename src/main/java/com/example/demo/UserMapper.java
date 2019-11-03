package com.example.demo;

import com.example.demo.pojos.UserResponse;
import com.example.demo.pojos.Users;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserResponse mapUsersResponse(Users user) {
        return new UserResponse(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getNumberOfBookings(),
                user.getStatus()
        );
    }
}
