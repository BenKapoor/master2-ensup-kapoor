package org.master2.ensup.kapoor.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import org.master2.ensup.kapoor.domaine.Personne;

public class PersonneDao implements IPersonneDao{
	DbConnec connexion = new DbConnec();
	
	@Override
	public int creerPersonne(Personne personne) {
		try {
			connexion.getConnection()
					.executeUpdate("INSERT INTO medecin(nom, prenom, login, motDepasse, dateNaissance) values" + "('"
							+ personne.getNom() + "','" + personne.getPrenom() + "','" + personne.getLogin() + "','"
							+ personne.getMotDePasse() + personne.getDateNaissance() + "');");

		} catch (Exception e) {
			System.out.println(e);
		}
		return 1;
	}

	@Override
	public Personne getPersonne(int idPersonne) {
		Personne personne = new Personne();
		try {

			ResultSet res = connexion.getConnection()
					.executeQuery("SELECT nom, prenom, login, motDepasse, dateNaissance FROM personne WHERE idPersonne=" + idPersonne);

			while (res.next()) {

				personne.setIdPersonne(res.getInt("id"));
				personne.setNom(res.getString("nom"));
				personne.setPrenom(res.getString("prenom"));
				personne.setLogin(res.getString("login"));
				personne.setMotDePasse(res.getString("motDePasse"));
				personne.setDateNaissance(res.getString("dateNaissance"));

			}

		}

		catch (Exception e) {
			System.out.println(e);
		}

		return personne;
	}

	@Override
	public void deletePersonne(int idPersonne) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Personne> findAllPersonnes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPersonneId(Personne p) {
		// TODO Auto-generated method stub
		return 0;
	}

}
