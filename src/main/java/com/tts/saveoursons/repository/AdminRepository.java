package com.tts.saveoursons.repository;

import com.tts.saveoursons.model.Admin;
import com.tts.saveoursons.model.Volunteer;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AdminRepository extends CrudRepository<Admin,Long> {

    Optional<Admin> findByEmail(String email);
    Admin findByUsername(String username);
}
