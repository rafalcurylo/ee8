package com.rafalcurylo.ee8.jaxrs.server;

import lombok.extern.log4j.Log4j;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("people")
public class PeopleResource {

    @EJB
    PeopleService service;

    @GET
    @Produces("application/json")
    public List<Person> getAll() {
        System.out.println("getAll");
        return service.getAll();

    }

}
