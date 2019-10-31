package org.master2.ensup.kapoor.domaine;

import java.util.ArrayList;

public class Personne {
	private int idPersonne;
	private String nom;
	private String prenom;
	private String login;
	private String motDePasse;
	private String dateNaissance;
	private ArrayList<Annonce> annonce;
	
	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public ArrayList<Annonce> getAnnonce() {
		return annonce;
	}
	public void setAnnonce(ArrayList<Annonce> annonce) {
		this.annonce = annonce;
	}
	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login
				+ ", motDePasse=" + motDePasse + ", dateNaissance=" + dateNaissance + ", annonce=" + annonce + "]";
	}
	/**
	 * @param idPersonne
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param motDePasse
	 * @param dateNaissance
	 * @param annonce
	 */
	public Personne(int idPersonne, String nom, String prenom, String login, String motDePasse, String dateNaissance,
			ArrayList<Annonce> annonce) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motDePasse = motDePasse;
		this.dateNaissance = dateNaissance;
		this.annonce = annonce;
	}	
}
