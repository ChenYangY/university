package com.myoffer.university.mapper;

import com.myoffer.university.model.University;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UniversityMapper {
    List<University> queryAll();
}

