package com.registration.entity;


import jakarta.persistence.*;
import java.util.*;

@Entity
public class User {
    @Id
    private  Integer userId;
    private String userName;
    private String password;
    private Long phoneNo;
    private String city;

    public int getUserId(){
        return userId;
    }
    public void setUserId(int userId){
        this.userId=userId;
    }
    public String getUsername() {
        return userName;
    }
    public void  setUserName(String UserName){
        this.userName =UserName;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public Long getPhoneNo(){
        return phoneNo;
    }
    public void setPhoneNo(long phoneNo){
        this.phoneNo=phoneNo;
    }

    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId && Objects.equals(userName, user.userName) && Objects.equals(password, user.password) && Objects.equals(phoneNo, user.phoneNo) && Objects.equals(city, user.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, password, phoneNo, city);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phoneNo=" + phoneNo +
                ", city='" + city + '\'' +
                '}';
    }
}
