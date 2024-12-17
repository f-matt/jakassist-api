package com.github.fmatt.jakassist.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("index")
public class IndexEndpoint {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getStatus() {
        return Response.ok("Status: online.").build();
    }

}
