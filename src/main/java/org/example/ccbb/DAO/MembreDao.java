package org.example.ccbb.DAO;

import org.example.ccbb.model.Incident;
import org.example.ccbb.model.Membre;

import java.util.Set;

public interface MembreDao {
    void inserer(Membre membre);
    Set<Incident> chargerListIncidents(String membreIdentifiant);
}

