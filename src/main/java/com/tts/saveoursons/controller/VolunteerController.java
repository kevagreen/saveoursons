package com.tts.saveoursons.controller;

import com.tts.saveoursons.model.Volunteer;
import com.tts.saveoursons.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "api/v1/register")
public class VolunteerController {

    @Autowired
    private VolunteerService volunteerService;

    @PostMapping
    public void register(@RequestBody Volunteer volunteer){
        volunteerService.addVolunteer(volunteer);
    }
}
