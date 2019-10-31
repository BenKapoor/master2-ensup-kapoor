package org.master2.ensup.kapoor.service;

import java.util.ArrayList;

import org.master2.ensup.kapoor.domaine.Annonce;
import org.master2.ensup.kapoor.domaine.Personne;

public interface IAnnonceService {
	//Crud Annonce
	 public int creerAnnonce(Personne personne, Annonce a);
	 public Annonce getAnnonce(int idAnnonce);
	 public void deleteAnnonce(int idAnnonce);
	 public void updateAnnonce(Annonce a);
	 public ArrayList<Annonce> findAllAnnonce();
	 public int getAnnonceId(Annonce a);
}
