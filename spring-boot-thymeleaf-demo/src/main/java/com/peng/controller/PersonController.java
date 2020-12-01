package com.peng.controller;

import com.peng.domain.Person;
import com.peng.service.PersonServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 业务控制类 返回视图
 */
@Controller
public class PersonController {

    @Autowired
    private PersonServiceImp personServiceImp;

    @RequestMapping(path = "/person/list")
    public String list(Model model){
        List<Person> allPerson=personServiceImp.selectAll();
        model.addAttribute("allPerson",allPerson);
        return "list";
    }

    @RequestMapping(path = "/person/add")
    public String add(Person person){
        return "add";
    }

    @RequestMapping(path = "/person/addPerson")
    public String addPerson(Person person){
        personServiceImp.add(person);
        return "redirect:/person/list";
    }

    @RequestMapping(path = "/person/delete")
    public String delete(String name){
        personServiceImp.delete(name);
        return "redirect:/person/list";
    }

}
