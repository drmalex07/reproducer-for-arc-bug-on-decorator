package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/foo")
public class FooController {

    @Inject
    FooService fooService;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() 
    {
        return "Hello from RESTEasy Reactive";
    }
    
    @Path("/find-by-id")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Foo findByName(@QueryParam("id") Integer id) 
    {
        return fooService.findById(id);
    }
}