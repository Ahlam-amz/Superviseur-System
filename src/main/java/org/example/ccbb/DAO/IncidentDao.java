package org.example.ccbb.DAO;

import org.example.ccbb.model.Incident;

import java.util.Set;

public interface IncidentDao {
    void inserer(Incident incident);
    void inserer(Set<Incident> incidents);
}

