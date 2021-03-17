package com.tts.saveoursons.service;

import com.tts.saveoursons.model.Volunteer;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface VolunteerService extends UserDetailsService {
    Iterable<Volunteer> getAllVolunteers();
   void addVolunteer(Volunteer volunteer);
    void deleteById(Long id);
    //Volunteer findByUsername(String email);

}
