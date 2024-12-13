package org.example.systemsuperviseur.DAO;


import org.example.systemsuperviseur.model.Incident;

import java.util.Set;

public interface IncidentDao {
    void inserer(Incident incident);
    void inserer(Set<Incident> incidents);

}


