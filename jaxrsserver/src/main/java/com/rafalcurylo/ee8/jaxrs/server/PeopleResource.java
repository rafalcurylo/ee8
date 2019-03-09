package com.rafalcurylo.ee8.jaxrs.server;

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

        return service.getAll();

    }

}
