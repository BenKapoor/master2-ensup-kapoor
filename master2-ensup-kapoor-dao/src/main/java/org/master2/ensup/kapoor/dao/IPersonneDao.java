package org.master2.ensup.kapoor.dao;

import java.util.ArrayList;

import org.master2.ensup.kapoor.domaine.Personne;

public interface IPersonneDao {
	//Crud Personne
		 public int creerPersonne(Personne personne);
		 public Personne getPersonne(int idPersonne);
		 public void deletePersonne(int idPersonne);
		 public void updatePersonne(Personne p);
		 public ArrayList<Personne> findAllPersonnes();
		 public int getPersonneId(Personne p);
}
