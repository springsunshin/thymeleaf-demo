package com.peng.controller;

import com.peng.domain.Person;
import com.peng.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(path = "/test")
    @ResponseBody
    public String demo(){
        List<Person> personList=personService.selectAll();
        System.out.println(personList.get(0).getName());
        return "你好吗？";
    }
}
