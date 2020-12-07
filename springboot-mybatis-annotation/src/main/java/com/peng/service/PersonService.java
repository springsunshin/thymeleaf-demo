package com.peng.service;

import com.peng.dao.PersonDao;
import com.peng.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public List<Person> selectAll(){
        return personDao.selectAll();
    }
}
