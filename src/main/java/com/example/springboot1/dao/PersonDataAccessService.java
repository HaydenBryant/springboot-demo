package com.example.springboot1.dao;

import com.example.springboot1.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class PersonDataAccessService implements PersonDao{

    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
//        List<Person> postgresPersonList = new List<Person>();
//        postgresPersonList.add(new Person(UUID.randomUUID(), "FROM POSTGRES DB"));

//        return postgresPersonList;
        return List.of(new Person(UUID.randomUUID(), "jamesLuther"));
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return 0;
    }
}
