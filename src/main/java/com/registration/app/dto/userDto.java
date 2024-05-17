package com.registration.app.dto;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class userDto {
    @Id
    private  Integer userId;
    private String userName;
    private String password;
    private Long phoneNo;
    private String city;
}
