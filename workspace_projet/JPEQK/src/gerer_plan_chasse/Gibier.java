package gerer_plan_chasse;

import java.util.Date;

public class Gibier {

	private int numero_bague;
	private String nom;
	private String sexe;
	private double poids;
	private Date date_prelevement;
	private String observations;
	
	
	public Gibier(int numero_bague, String nom, String sexe, double poids, Date date_prelevement) {
		super();
		this.numero_bague = numero_bague;
		this.nom = nom;
		this.sexe = sexe;
		this.poids = poids;
		this.date_prelevement = date_prelevement;
	}
	
	public Gibier(String nom, String sexe, double poids, Date date_prelevement) {
		super();
		this.nom = nom;
		this.sexe = sexe;
		this.poids = poids;
		this.date_prelevement = date_prelevement;
	}
	
	public int getNumero_bague() {
		return numero_bague;
	}
	
	public void setNumero_bague(int numero_bague) {
		this.numero_bague = numero_bague;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getSexe() {
		return sexe;
	}
	
	public void setSexe(String sexe) {
		System.out.println("Choix : Male ou Femelle ");
		if(sexe == "Femelle" || sexe == "Male"){
			this.sexe = sexe;
		}
	}
	
	public double getPoids() {
		return poids;
	}
	
	public void setPoids(double poids) {
		this.poids = poids;
	}
	
	public String getObservations() {
		return observations;
	}
	
	public void setObservations(String observations) {
		this.observations = observations;
	}
	
	public Date getDate_prelevement() {
		return date_prelevement;
	}

	public void setDate_prelevement(Date date_prelevement) {
		this.date_prelevement = date_prelevement;
	}
	
	@Override
	public String toString() {
		return "Gibier : numero_bague = " + numero_bague + ", nom = " + nom
				+ ",\n sexe = " + sexe + ", poids = " + poids + ",\n observations = "
				+ observations;
	}


	
}
