package com.chun.service;

import com.chun.mapper.PersonMapper;
import com.chun.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonMapper mapper;

    public List<Person> selectAll(){
        return mapper.selectAll();
    }

}
