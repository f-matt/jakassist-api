package com.github.fmatt.jakassist.service;

import com.github.fmatt.jakassist.domain.Project;
import com.github.fmatt.jakassist.util.CustomRuntimeException;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class ProjectsService {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveProject(Project project) {
        if (project == null)
            throw new CustomRuntimeException("Project is mandatory.");

        try {
            if (project.getId() == null)
                entityManager.persist(project);
            else
                entityManager.merge(project);
        } catch (Exception e) {
            throw new CustomRuntimeException("Error saving project.");
        }
    }

}
