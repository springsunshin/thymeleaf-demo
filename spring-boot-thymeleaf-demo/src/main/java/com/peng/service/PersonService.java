package com.peng.service;

import com.peng.domain.Person;

import java.util.List;

public interface PersonService {

    public List<Person> selectAll();

    public void add(Person person);

    public void delete(String name);
}
