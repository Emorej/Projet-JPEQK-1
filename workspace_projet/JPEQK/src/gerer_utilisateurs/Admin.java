package gerer_utilisateurs;

import java.util.Date;

public class Admin extends User{

	public Admin(int id, String nom, String prenom, Date date_arrivee,
			Role role, boolean avoir_cotise) {
		super(id, nom, prenom, date_arrivee, role, avoir_cotise);
		// TODO Auto-generated constructor stub
	}

	public void gererCotisations(){
		// TODO
	}
	
	public void gererBudget(){
		// TODO
	}
	
	public void gererBattue(){
		// TODO
	}
}
