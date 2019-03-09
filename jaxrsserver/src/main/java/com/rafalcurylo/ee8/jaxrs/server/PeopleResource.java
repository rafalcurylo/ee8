package com.rafalcurylo.ee8.jaxrs.server;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import java.util.Arrays;
import java.util.List;

@ApplicationPath("peoples")
public class PeopleResource extends Application {

    @GET
    @Path("all")
    @Produces("application/json")
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

        return Arrays.asList(john, ann);
    }

}