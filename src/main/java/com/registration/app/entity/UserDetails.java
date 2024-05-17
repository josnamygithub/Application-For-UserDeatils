package com.registration.app.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.*;
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "UserDetails")
public class UserDetails {
    @Id
    @Column(name = "userId")
    private Integer userId;
    private String userName;
    private String password;
    private Long phoneNo;
    private String city;

}