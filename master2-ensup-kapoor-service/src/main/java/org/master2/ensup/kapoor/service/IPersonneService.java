package org.master2.ensup.kapoor.service;

import java.util.ArrayList;

import org.master2.ensup.kapoor.domaine.Personne;

public interface IPersonneService {
	//Crud Personne
	 public int creerPersonne(Personne personne);
	 public Personne getPersonne(int idPersonne);
	 public void deletePersonne(int idPersonne);
	 public void updatePersonne(Personne p);
	 public ArrayList<Personne> findAllPersonnes();
	 public int getPersonneId(Personne p);
}
