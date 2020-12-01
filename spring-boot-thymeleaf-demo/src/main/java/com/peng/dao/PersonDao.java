package com.peng.dao;

import com.peng.domain.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class PersonDao {

    private static List<Person> list=new ArrayList<>();

    static {
        list.add(new Person("霉霉","大厨"));
        list.add(new Person("春天","店长"));
        list.add(new Person("夏天","财务"));
        list.add(new Person("秋天","经理"));
        list.add(new Person("冬天","前台"));
    }

    public List<Person> getList(){
        return list;
    }

    public void add(Person person){
        list.add(person);
    }

    public void delete(String name){
        Iterator<Person> iterator=list.iterator();
        while (iterator.hasNext()){
            Person person=iterator.next();
            if (person.getName().equals(name)){
                list.remove(person);
                return;
            }
        }
    }
}
