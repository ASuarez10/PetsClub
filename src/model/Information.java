package model;
import java.util.ArrayList;
import java.io.PrintWriter;

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
	
	public void deletePet(String idCM, String idPa, String petToDelete) {
		boolean esta = false;
		
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(idCM.equals(clubs.get(i).getId())) {
				esta = true;
				clubs.get(i).deletePet(idPa, petToDelete);
			}
		}
	}
	
	/**
	 * Method to have an ordered list of number of partners
	 * @return ordered list
	 */
	
	public void orderByPartners(){
		ArrayList<Club> list = clubs;
		
        for(int i = 0; i < list.size() - 1; i++){

            for(int j = 0; j < list.size() - 1; j++){

                if (list.get(j).numberOfPartners() < list.get(j+1).numberOfPartners()){

                    Club tmp = list.get(j+1);

                    list.set(j+1, list.get(j));

                    list.set(j, tmp);

                }

            }

        }
		
        try {
          PrintWriter writer = new PrintWriter("files\\\\ArchiveOfClubs.txt", "UTF-8");
          for(int i = 0; i < list.size(); i++) {
        	  writer.println(list.get(i));
          }
          writer.close();
      } catch (Exception e) {
          e.printStackTrace();
      }
		
	}
	
}//final
