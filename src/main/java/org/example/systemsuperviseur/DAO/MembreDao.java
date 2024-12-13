package org.example.systemsuperviseur.DAO;

import org.example.systemsuperviseur.model.Incident;
import org.example.systemsuperviseur.model.Membre;

import java.util.Set;

public interface MembreDao {
    void inserer(Membre membre);


    Set<Incident> chargerListIncidents(String membreIdentifiant);
}



