package com.rafalcurylo.ee8.jaxrs.server;

import javax.ejb.Stateless;
import java.util.Arrays;
import java.util.List;

@Stateless
public class PeopleService {

    public List<Person> getAll() {

        Person john = Person.builder()
                .firstName("John")
                .lastName("Smith")
                .id(1)
                .build();

        Person ann = Person.builder()
                .firstName("Ann")
                .lastName("Smith")
                .id(2)
                .build();

        Person caren = Person.builder()
                .firstName("Caren")
                .lastName("Smith")
                .id(3)
                .build();

        return Arrays.asList(john, ann, caren);

    }

}
