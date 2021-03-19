package com.tts.saveoursons.controller;

import com.tts.saveoursons.model.Donate;
import com.tts.saveoursons.service.DonateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping(path = "/donate")
public class DonateController {

    @Autowired
    private DonateService donateService;

    @PostMapping
    public void donate(Donate donate) {donateService.addDonate(donate);}



        @PostMapping(value = "/donate")
        public String createNewUser(@Valid Donate donateForm, Model model) {
        donateService.addDonate(donateForm);
        model.addAttribute("success", "Donation successful!");
        model.addAttribute("donate", new Donate());

        return "donate";
    }

        @GetMapping(value="/donate")
        public String registration(Model model){
            Donate donateForm = new Donate();
            model.addAttribute("user", donateForm);
            return "donate";
        }

    }



