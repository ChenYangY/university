package com.myoffer.university.service.impl;

import com.myoffer.university.mapper.UniversityMapper;
import com.myoffer.university.model.University;
import com.myoffer.university.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("universityService")
public class UniversityServiceImpl implements UniversityService {
    @Autowired
    private UniversityMapper mapper;
    @Override
    public List<University> qeuryAll() {
        return this.mapper.queryAll();
    }
}
