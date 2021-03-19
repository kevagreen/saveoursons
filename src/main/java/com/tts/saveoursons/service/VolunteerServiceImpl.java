package com.tts.saveoursons.service;

import com.tts.saveoursons.model.Volunteer;
import com.tts.saveoursons.repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VolunteerServiceImpl implements VolunteerService{

    @Autowired
    private VolunteerRepository volunteerRepository;

    @Override
    public Iterable<Volunteer> getAllVolunteers() {
        return volunteerRepository.findAll();
    }

      public void addVolunteer(Volunteer volunteer) {
            Optional<Volunteer> volunteerOptional = volunteerRepository.findByEmail(volunteer.getEmail());
            if (volunteerOptional.isPresent()){
                throw new IllegalStateException("email taken");
            }

            volunteer.setEmail(volunteer.getEmail());
            volunteer.setName(volunteer.getName());
            volunteer.setEmail(volunteer.getEmail());
            volunteer.setAddress(volunteer.getAddress());
            volunteer.setPhone(volunteer.getPhone());
            volunteerRepository.save(volunteer);

    }

    @Override
    public void deleteById(Long id) {
        boolean exist = volunteerRepository.existsById(id);
        if (!exist){
            throw new IllegalStateException("volunteer with id " + id + "not found");
        }
        volunteerRepository.deleteById(id);
    }

}
