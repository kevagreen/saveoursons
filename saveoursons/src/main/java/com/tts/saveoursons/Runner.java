package com.tts.saveoursons;


import com.tts.saveoursons.repository.CrimeCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    CrimeCaseRepository crimeCaseRepository;

    @Override
    public void run(String... args) throws Exception {

    }

   // @Override
//    public void run(String... args) throws Exception {
//        crystalRepository.save(new Crystal("clear", "clear quartz"));
//        crystalRepository.save(new Crystal("purple", "amethyst"));
//        crystalRepository.save(new Crystal("yello", "citrine"));
//    }
}
