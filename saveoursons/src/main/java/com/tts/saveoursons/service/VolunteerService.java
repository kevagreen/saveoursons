package com.tts.saveoursons.service;

import com.tts.saveoursons.model.Volunteer;
import com.tts.saveoursons.repository.VolunteerRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public interface VolunteerService{
    Iterable<Volunteer> getAllVolunteers();
    void addVolunteer(Volunteer volunteer);
    void deleteById(Long id);

}
