package com.scon;

import com.googlecode.utterlyidle.annotations.GET;
import com.googlecode.utterlyidle.annotations.Path;

@Path("/")
public class HelloWorldResource {

    @GET
    public String index() {
        return "Hello World";
    }
}
