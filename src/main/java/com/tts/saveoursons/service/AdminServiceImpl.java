package com.tts.saveoursons.service;

import com.tts.saveoursons.model.Admin;
import com.tts.saveoursons.model.Volunteer;
import com.tts.saveoursons.repository.AdminRepository;
import com.tts.saveoursons.repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService, UserDetailsService {

    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public Iterable<Admin> getAllAdmin() {
        return adminRepository.findAll();
    }

    public Admin findByUsername(String username){
        return adminRepository.findByUsername(username);
    }



    public void addAdmin(Admin admin) {
        Optional<Admin> adminOptional = adminRepository.findByEmail(admin.getEmail());
        if (adminOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }

        admin.setEmail(admin.getEmail());
        admin.setName(admin.getName());
        admin.setUsername(admin.getUsername());
        admin.setPassword(bCryptPasswordEncoder.encode(admin.getPassword()));
        admin.setPhone(admin.getPhone());
        adminRepository.save(admin);

    }

    @Override
    public void deleteById(Long id) {
        boolean exist = adminRepository.existsById(id);
        if (!exist){
            throw new IllegalStateException("volunteer with id " + id + "not found");
        }
        adminRepository.deleteById(id);
    }


    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return adminRepository.findByEmail(username).orElseThrow(()-> new UsernameNotFoundException("username not found"));
    }
}