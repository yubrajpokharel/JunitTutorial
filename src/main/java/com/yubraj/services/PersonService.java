package com.yubraj.services;

import com.yubraj.domain.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yubrajpokharel on 8/1/17.
 */
public class PersonService {

    List<Person> personList;

    public PersonService() {
        this.personList = new ArrayList<Person>();
    }

    public void addPerson(Person person){
        personList.add(person);
    }

    public void removePerson(Person person){
        personList.remove(person);
    }

    public List<Person> getAllPerson(){
        return personList;
    }

}
