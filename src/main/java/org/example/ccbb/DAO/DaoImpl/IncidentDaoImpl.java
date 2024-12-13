package org.example.ccbb.DAO.DaoImpl;

import org.example.ccbb.DAO.IncidentDao;
import org.example.ccbb.model.Incident;

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

