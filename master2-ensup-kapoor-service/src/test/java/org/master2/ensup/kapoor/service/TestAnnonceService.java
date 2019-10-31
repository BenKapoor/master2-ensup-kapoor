package org.master2.ensup.kapoor.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.master2.ensup.kapoor.dao.IAnnonceDao;
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
public class TestAnnonceService {
	@Mock IAnnonceDao dao;
	
	@InjectMocks
	AnnonceService service;
	
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
		
		Mockito.when(this.dao.creerAnnonce(spiedPersonne, spiedAnnonce));
		
		Annonce annonce = service.getAnnonce(1);
		
		assertEquals(annonce.getIdAnnonce(), 1);
		
		Mockito.verify(dao, Mockito.times(1));
		
		
	}
	
}
