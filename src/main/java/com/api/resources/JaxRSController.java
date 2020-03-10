package com.api.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


@Path("/")
public class JaxRSController {

    @GET
    @Path("helloMessage")
    public Response sayHello() {

        String output = "Hello world!";

        return Response.ok(output).status(200).build();

    }
}
