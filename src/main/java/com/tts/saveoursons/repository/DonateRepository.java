package com.tts.saveoursons.repository;

import com.tts.saveoursons.model.Donate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonateRepository extends CrudRepository<Donate, Long> {
}
