package com.CourtReserve.app.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userType; //Map to Code@UserType //User Type  - Admin / Member / Non member / VIP / TopMgmt
    private String mobileNo;
    private String email;
    private String userName;
    private String password;
    private String location;
    private String country; // Countries -
    private String referral = "";
    private LocalDateTime lastLogin;
    private String uadr1;
    private String uadr2;
    private String uadr3;
    private String uadr4;
    private String upincode;

    // Constructors, getters, and setters

    public Map getDict(){
        Map dict = new HashMap<>();
        dict.putIfAbsent("id",id);
        dict.putIfAbsent("userType", userType);//*
        dict.putIfAbsent("userName", userName);//*
        dict.putIfAbsent("mobileNo", mobileNo);//*
        dict.putIfAbsent("email", email);//*
        dict.putIfAbsent("location", location);
        dict.putIfAbsent("country", country);
        dict.putIfAbsent("uadr1", uadr1);
        dict.putIfAbsent("uadr2", uadr2);
        dict.putIfAbsent("uadr3", uadr3);
        dict.putIfAbsent("uadr4", uadr4);
        dict.putIfAbsent("upincode", upincode);


        return dict;
    }
}
