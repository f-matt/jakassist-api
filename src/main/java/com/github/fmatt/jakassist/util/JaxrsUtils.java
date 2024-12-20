package com.github.fmatt.jakassist.util;

import com.github.fmatt.jakassist.dto.RestErrorDto;
import jakarta.ws.rs.core.Response;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JaxrsUtils {

    public static Response processException(Exception exception, Logger logger, String defaultMessage) {
        if (exception == null)
            return Response.status(Response.Status.BAD_REQUEST).entity("An unknown error ocurred.").build();

        if (exception instanceof CustomRuntimeException)
            return Response.status(Response.Status.BAD_REQUEST).entity(new RestErrorDto(exception.getMessage())).build();

        logger.log(Level.SEVERE, exception.getMessage(), exception);
        return Response.status(Response.Status.BAD_REQUEST).entity(new RestErrorDto(defaultMessage)).build();
    }

}
