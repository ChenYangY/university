package com.myoffer.university.controller;

import com.myoffer.university.model.University;
import com.myoffer.university.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UniversityController {
    @Autowired
    private UniversityService universityService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<University> queryAll() {
        return this.universityService.qeuryAll();
    }
}
