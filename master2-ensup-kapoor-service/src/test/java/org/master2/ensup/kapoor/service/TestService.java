package org.master2.ensup.kapoor.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.master2.ensup.kapoor.dao.IAnnonceDao;
import org.master2.ensup.kapoor.dao.IPersonneDao;
import org.master2.ensup.kapoor.domaine.Annonce;
import org.master2.ensup.kapoor.domaine.Personne;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * @author benja
 *
 */
public class TestService {
	@Mock 
	IAnnonceDao annonceDao;
	
	@Mock
	IPersonneDao personneDao;
	
	@InjectMocks
	AnnonceService annonceService;
	
	@InjectMocks
	PersonneService personneService;
	
	@Test
	public void testCreationAnnonce() {
		
		MockitoAnnotations.initMocks(this);
		/**
		 * Sénario test: à partir de la saisie des différents attributs, l'annonce sera créé
		 *
		 */
		Annonce spiedAnnonce = new Annonce(1, "Pomme", "Les pommes sont rouges", 4.13);
		ArrayList<Annonce> array = new ArrayList<>();
		array.add(spiedAnnonce);
		
		Personne spiedPersonne = new Personne(1, "Jean", "Pierre", "jp", "azerty", "12/03/210", array);
		
		Mockito.when(this.annonceDao.creerAnnonce(spiedPersonne, spiedAnnonce));
		
		Annonce annonce = annonceService.getAnnonce(1);
		
		assertEquals(annonce.getIdAnnonce(), 1);
		
		//Mockito.verify(annonceDao, Mockito.times(1));
		
		
	}
	
	@Test
	public void testCreationPersonne() {
		
		Annonce spiedAnnonce = new Annonce(1, "Pomme", "Les pommes sont rouges", 4.13);
		ArrayList<Annonce> array = new ArrayList<>();
		array.add(spiedAnnonce);
		
		Personne spiedPersonne = new Personne(1, "Jean", "Pierre", "jp", "azerty", "12/03/210", array);
		
		Mockito.when(this.personneDao.creerPersonne(spiedPersonne));
		
		Personne personne = personneService.getPersonne(1);
		
		assertEquals(personne.getIdPersonne(), 1);
		
		//Mockito.verify(personneDao, Mockito.times(1));
	}
	
}
