package com.tts.saveoursons.model;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@EqualsAndHashCode
@Table
public class Volunteer{

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @SequenceGenerator(
            name = "volunteer_sequence",
            sequenceName = "volunteer_sequence",
            allocationSize = 1
    )
    private Long id;
    private String name;
    private String email;
    private Long phone;
    private String address;
    String volunteeringFor;
    @Enumerated(EnumType.STRING)
    private AppUserRole appUserRole;



    public Volunteer(String name, String lastName, String email, String address, Long phone, String volunteeringFor, AppUserRole appUserRole) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.volunteeringFor = volunteeringFor;
        this.appUserRole = appUserRole;
    }


}
