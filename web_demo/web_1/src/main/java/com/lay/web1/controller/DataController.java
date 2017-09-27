package com.lay.web1.controller;

import com.lay.web1.dao.PersonRepository;
import com.lay.web1.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @Author yalei.chen
 * @Date 2017/9/22
 * @Since JDK 1.8
 */
@RestController
@RequestMapping("/person")
public class DataController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value = "/save")
    public Person save(String name,String address,Integer age){

        Person s = new Person(null, name, age, address, new Date());
        personRepository.save(s);

        return s;
    }


    @RequestMapping("/q2")
    public List<Person> findByNameAndAddress(String name,String address){

        List<Person> list = personRepository.findByNameAndAddress(name, address);
        return list;
    }


}
