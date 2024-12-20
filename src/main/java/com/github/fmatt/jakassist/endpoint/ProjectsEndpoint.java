package com.github.fmatt.jakassist.endpoint;

import com.github.fmatt.jakassist.domain.Project;
import com.github.fmatt.jakassist.service.ProjectsService;
import com.github.fmatt.jakassist.util.JaxrsUtils;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.apache.commons.lang3.StringUtils;

import java.util.logging.Logger;

@Path("projects")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProjectsEndpoint {

    @Inject
    private Logger logger;

    @Inject
    private ProjectsService projectsService;

    @POST
    public Response createProject(Project project) {
        if (project == null)
            return Response.status(Response.Status.BAD_REQUEST).entity("Project is mandatory.").build();

        if (StringUtils.isBlank(project.getName()))
            return Response.status(Response.Status.BAD_REQUEST).entity("Project name is mandatory.").build();

        try {
            projectsService.saveProject(project);
            return Response.ok(project).build();
        } catch (Exception e) {
            return JaxrsUtils.processException(e, logger, "Error saving project.");
        }
    }

}
