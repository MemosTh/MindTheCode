package com.example.demo.pojos;

import com.example.demo.enumeration.UserStatusEnum;

public class UserResponse {

    private long id;
    private String firstName;
    private String lastName;
    private int numberOfBookings;
    private UserStatusEnum status;

    public UserResponse(long id, String firstName, String lastName, int numberOfBookings, UserStatusEnum status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfBookings = numberOfBookings;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfBookings() {
        return numberOfBookings;
    }

    public void setNumberOfBookings(int numberOfBookings) {
        this.numberOfBookings = numberOfBookings;
    }

    public UserStatusEnum getStatus() {
        return status;
    }

    public void setStatus(UserStatusEnum status) {
        this.status = status;
    }
}
