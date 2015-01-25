package gerer_utilisateurs;

public enum Role {
	
	associé(300.5),
	propriétaire(260.7);
	
	private double prix;
	
	private Role(double prix){
		this.prix = prix;
	}
	
	public double getPrix(){
		return prix;
	}
}
