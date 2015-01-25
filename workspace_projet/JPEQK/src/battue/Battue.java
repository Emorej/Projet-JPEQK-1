package battue;

import gerer_plan_chasse.Gibier;
import gerer_postes.Poste;
import gerer_utilisateurs.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Battue {

	private User chef_battue;
	private List<User> participants = new ArrayList<>();
	private List<Poste> postes_occupes = new ArrayList<>();
	private Date date_battue;
	private List<Gibier> gibiers_preleves = new ArrayList<>();
	
	public void ajouterParticipant(User chasseur){
		participants.add(chasseur);
	}
	
	public void supprimerParticipant(User chasseur){
		participants.remove(chasseur);
	}
	
	public void ajouterGibier(Gibier gib){
		gibiers_preleves.add(gib);
	}
	
	public User getChef_battue() {
		return chef_battue;
	}
	public void setChef_battue(User chef_battue) {
		this.chef_battue = chef_battue;
	}
	public List<User> getParticipants() {
		return participants;
	}
	public void setParticipants(List<User> participants) {
		this.participants = participants;
	}
	public List<Poste> getPostes_occupes() {
		return postes_occupes;
	}
	public void setPostes_occupes(List<Poste> postes_occupes) {
		this.postes_occupes = postes_occupes;
	}
	public Date getDate_battue() {
		return date_battue;
	}
	public void setDate_battue(Date date_battue) {
		this.date_battue = date_battue;
	}
	public List<Gibier> getGibiers_preleves() {
		return gibiers_preleves;
	}
	public void setGibiers_preleves(List<Gibier> gibiers_preleves) {
		this.gibiers_preleves = gibiers_preleves;
	}
	
	public Battue(User chef_battue, List<User> participants,
			List<Poste> postes_occupes, Date date_battue) {
		super();
		this.chef_battue = chef_battue;
		this.participants = participants;
		this.postes_occupes = postes_occupes;
		this.date_battue = date_battue;
	}
	
	
}
