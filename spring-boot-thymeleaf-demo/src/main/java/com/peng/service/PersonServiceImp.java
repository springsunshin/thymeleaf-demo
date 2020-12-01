package com.peng.service;

import com.peng.dao.PersonDao;
import com.peng.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImp implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public List<Person> selectAll() {
        return personDao.getList();
    }

    @Override
    public void add(Person person) {
        personDao.add(person);
    }

    @Override
    public void delete(String name) {
        personDao.delete(name);
    }
}
