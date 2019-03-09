package com.rafalcurylo.ee8.jaxrs.client;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.GenericType;
import java.util.List;

@ApplicationPath("resources")
@Path("people")
public class PeopleClient extends Application {

    @GET
    @Produces("application/json")
    public List<Person> getAll() {

        Client client = ClientBuilder.newClient();
        List<Person> list = client.target("http://localhost:8080/jaxrs-server")
                .path("resources/people")
                .request()
                .get(new GenericType<List<Person>>() {});

        return list;
    }

}
