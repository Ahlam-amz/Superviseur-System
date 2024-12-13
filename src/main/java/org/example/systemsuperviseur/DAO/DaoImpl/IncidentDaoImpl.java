package org.example.systemsuperviseur.DAO.DaoImpl;

import org.example.systemsuperviseur.DAO.IncidentDao;
import org.example.systemsuperviseur.model.Incident;

import java.util.HashSet;
import java.util.Set;

public class IncidentDaoImpl implements IncidentDao {
    private HashSet<Incident> incidents = new HashSet<>();

    @Override
    public void inserer(Incident incident) {
        incidents.add(incident);
    }

    @Override
    public void inserer(Set<Incident> incidentsToAdd) {
        incidents.addAll(incidentsToAdd);
    }
}


