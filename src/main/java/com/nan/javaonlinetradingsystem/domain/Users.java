package com.nan.javaonlinetradingsystem.domain;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Objects;

public class Users {
    private int userID;
    private String userName;
    private String password;
    private String email;
    private String role;
    private Date registrationDate;

    public Users() {
    }

    public Users(int userID, String userName, String password, String email, String role) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.role = role;
        this.registrationDate = Date.valueOf(LocalDate.now());
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return userID == users.userID &&
                Objects.equals(userName, users.userName) &&
                Objects.equals(password, users.password) &&
                Objects.equals(email, users.email) &&
                Objects.equals(role, users.role) &&
                Objects.equals(registrationDate, users.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, userName, password, email, role, registrationDate);
    }
}