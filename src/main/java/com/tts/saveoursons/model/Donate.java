package com.tts.saveoursons.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Donate {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
//    @SequenceGenerator(
//            name = "donate_sequence",
//            sequenceName = "donate_sequence",
//            allocationSize = 1
//    )
//    @Column(name = "donate_id")
    private Long id;

    @Length(message = "Can not leave empty")
//    @Length(max = 15, message = "Your first name cannot have more than 15 characters")
    private String firstName;
//    @Length(min = 3, message = "Your last name must have at least 3 characters")
    @Length(message = "Your last name cannot have more than 15 characters")
    private String lastName;
//    @NotEmpty(message = "Please provide a amount.")
    private String amount;
//    @NotEmpty(message = "Please provide a note")
    private String donorNotes;
//    @Email(message = "Please provide an email.")
//    @NotEmpty(message = "Please provide an email.")
    private String email;
//    @NotEmpty(message = "Please provide a phone number.")
    private String phoneNumber;
//    @NotEmpty(message = "Please provide a address.")
    private String street;
//    @NotEmpty(message = "Please provide a city.")
    private String city;
//    @NotEmpty(message = "Please provide a state.")
    private String state;
//    @NotEmpty(message = "Please provide a zip code.")
    private String zipCode;




//    public Donate(String firstName, String lastName, String amount, String donorNotes, String email, String phoneNumber, String street, String city, String state, String zipCode) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.amount = amount;
//        this.donorNotes = donorNotes;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//        this.street = street;
//        this.city = city;
//        this.state = state;
//        this.zipCode = zipCode;
//    }


}