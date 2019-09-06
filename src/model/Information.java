package model;
import java.util.ArrayList;

public class Information {
	
	/**
	 * ArrayList of clubs
	 */
	private ArrayList<Club>clubs;

	 /**
	 * Constructor of Information's class
	 */
	public Information() {
		clubs = new ArrayList<Club>();
	}

	/**
	 * Method to give the ArrayList clubs
	 * @return clubs list
	 */
	public ArrayList<Club> getClubs() {
		return clubs;
	}

	/**
	 * Method to modify the clubs list
	 * @param partners - new clubs list
	 */
	public void setClubs(ArrayList<Club> clubs) {
		this.clubs = clubs;
	}
	
	/**
	 * Method to add a club
	 * @param nC - club to add
	 */
	public void addClub(Club nC) {
		boolean esta = false;
		
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if (nC.getId().equals(clubs.get(i).getId())) {
				esta = true;
			}
		}
		if(esta == false) {
			clubs.add(nC);
		}
	}
	
	/**
	 * Method to delete a club
	 * @param clubToDelete - Club's ID or name to delete
	 */
	public void deleteClub(String clubToDelete) {
		
		boolean esta = false;
		
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(clubToDelete.equals(clubs.get(i).getId())) {
				esta = true;
				clubs.remove(i);
			}else if(clubToDelete.equals(clubs.get(i).getName())) {
				esta = true;
				clubs.remove(i);
			}
		}
		
	}
	
	/**
	 * Method to add a pet
	 * @param idC - Club's id where will be added the pet
	 * @param idP - Partner's id who will have the pet
	 * @param pTA - Pet to add
	 */
	public void addPet(String idC, String idP, Pet pTA) {
		boolean esta = false;
		
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(clubs.get(i).getId().equals(idC)) {
				esta = true;
				clubs.get(i).addPet(idP, pTA);
			}
		}
	}
	
	/**
	 * Method to add a pet
	 * @param idCl - Club's id where will be added the partner
	 * @param nP - Partner to add
	 */
	public void addPartner(String idCl, Partner nP) {
		boolean esta = false;
		
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(clubs.get(i).getId().equals(idCl)) {
				esta = true;
				clubs.get(i).addPartner(nP);
			}
		}
	}
	
	/**
	 * Method to delete a club
	 * @param idCR - Club's id where is the partner
	 * @param partToDelete - Partner's ID or name to delete
	 */
	public void deletePartner(String idCR, String partToDelete) {
		boolean esta = false;
		
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(clubs.get(i).getId().equals(idCR)) {
				esta = true;
				clubs.get(i).deletePartner(partToDelete);
			}
		}
		
	}
	
}//final
