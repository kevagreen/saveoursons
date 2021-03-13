package com.tts.saveoursons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.*;
import javax.persistence.*;

import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

@Data
@NoArgsConstructor
@Entity(name = "volunteers")
public class Volunteer {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @SequenceGenerator(
            name = "volunteer_sequence",
            sequenceName = "volunteer_sequence",
            allocationSize = 1
    )
    private Long id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int phone;
    @Enumerated(EnumType.STRING)
    private AppUserRole appUserRole;

    public Volunteer(String firstName, String lastName, String password, String email, int phone, AppUserRole appUserRole) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.appUserRole = appUserRole;
    }
}
