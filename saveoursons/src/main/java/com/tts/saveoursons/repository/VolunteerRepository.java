package com.tts.saveoursons.repository;


import com.tts.saveoursons.model.Volunteer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface VolunteerRepository extends CrudRepository<Volunteer,Long> {

    Optional<Volunteer> findByEmail(String email);
    Volunteer findByUsername(String username);

}
