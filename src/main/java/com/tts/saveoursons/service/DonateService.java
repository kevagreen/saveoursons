package com.tts.saveoursons.service;

import com.tts.saveoursons.model.Donate;




public interface DonateService{
    Iterable<Donate> getAllDonate();
    void addDonate(Donate donate);
    void deleteById(Long id);
    //Donate findByUsername(String email);
}
