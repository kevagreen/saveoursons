package com.tts.saveoursons.service;

import com.tts.saveoursons.model.Admin;
import com.tts.saveoursons.model.Volunteer;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AdminService extends UserDetailsService {

        Iterable<Admin> getAllAdmin();
        void addAdmin(Admin admin);
        void deleteById(Long id);

    }


