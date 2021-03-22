package com.tts.saveoursons.service;

import com.tts.saveoursons.model.Donate;
import com.tts.saveoursons.repository.DonateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonateServiceImpl implements DonateService {
    @Autowired
    private DonateRepository donateRepository;


    @Override
    public Iterable<Donate> getAllDonate() {

        return donateRepository.findAll();

    }

    @Override
    public void addDonate(Donate donate) {
    donate.setFirstName(donate.getFirstName());
    donate.setLastName(donate.getLastName());
    donate.setAmount(donate.getAmount());
    donate.setDonorNotes(donate.getDonorNotes());
    donate.setEmail(donate.getEmail());
    donate.setPhoneNumber(donate.getPhoneNumber());
    donate.setStreet(donate.getStreet());
    donate.setCity(donate.getCity());
    donate.setState(donate.getState());
    donate.setZipCode(donate.getZipCode());

    donateRepository.save(donate);


    }

    @Override
    public void deleteById(Long id) {

    }
}
