package com.pedantic.config;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.GET;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

@ApplicationPath("api/v1")
public class JAXRSConfig extends Application {

    @GET

    public String helloUser()
    {
        return "Hello";
    }

}
