package com.pedantic.rest;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;

@Path("hello")
public class HelloWorldRest {

    @Path("{name}")
    @GET
    public JsonObject greet(@PathParam("name") String name){


        return Json.createObjectBuilder().add("name", name)
                .add("greeting", "Hello, "+name).
                add("message", "Hello from Jakarta EE").build();
    }
}
