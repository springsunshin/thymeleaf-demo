package com.chun.controller;

import com.chun.domain.Person;
import com.chun.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(path = "/test")
    @ResponseBody
    public String test(HttpServletRequest request){
        List<Person> list=personService.selectAll();
        System.out.println(list.get(0).getName());
        return "你好";
    }

}
