package com.rafalcurylo.ee8.jaxrs.server;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import java.util.List;

@ApplicationPath("resources")
@Path("people")
//@Named
//@RequestScoped
public class PeopleResource extends Application {

   // @EJB
 //   PeopleService service;

    @GET
    @Produces("application/json")
    public List<Person> getAll() {

        //return service.getAll();
        return null;
    }

}
