package com.tts.saveoursons.service;

import com.tts.saveoursons.model.Volunteer;
import org.springframework.security.core.userdetails.UserDetails;


public interface VolunteerService{
    Iterable<Volunteer> getAllVolunteers();
   void addVolunteer(Volunteer volunteer);
    void deleteById(Long id);
    //Volunteer findByUsername(String email);

}
