package model;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.IOException;
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
		initClubs();	
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
          PrintWriter writer = new PrintWriter("files/ArchiveOfClubsOrderedByNumberOfPartners.txt", "UTF-8");
          for(int i = 0; i < list.size(); i++) {
        	  writer.println(list.get(i));
          }
          writer.close();
        } catch (Exception e) {
          e.printStackTrace();
          }
		
	}
	
	/**
	 * Method to compare the ID of 2 clubs
	 * @return A number that indicates if an ID is higher or less than another ID
	 */
	public int compare(Club c, Club p) {
		int valor=0;
		if(c.getId().compareToIgnoreCase(p.getId())>0) {
			valor=1;
		}else if(c.getId().compareToIgnoreCase(p.getId())<0) {
			valor=-1;
		}else {
			valor=0;
		}
		return valor;
	}
	
	/**
	 * Method to generate an archive with an ordered list of clubs by ID
	 */
	public void listClubByID() {
		
		ArrayList<Club> list = clubs;

		for(int i = 1; i < list.size(); i++) {
			for(int j = i; j > 0 && compare(list.get(j-1), list.get(j)) > 0; j--) { 
				
				Club temp = list.get(j);
				list.set(j, list.get(j-1));
				list.set(j-1, temp);			
			}
		}
		
		try {
            PrintWriter writer = new PrintWriter("files/ArchiveOfClubsOrderedByID.txt", "UTF-8");
            for(int i = 0; i < list.size(); i++) {
          	  writer.println(list.get(i));
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
          }		
	}
	
	/**
	 * Method to generate an archive with an ordered list of clubs by name
	 */
	public void listClubByName() {
		
		ArrayList<Club> list = clubs;

		for(int i = 1; i < list.size(); i++) {
			for(int j = i; j > 0 && list.get(j-1).getName().compareTo(list.get(j).getName()) > 0; j--) {
				
				Club temp = list.get(j);
				list.set(j, list.get(j-1));
				list.set(j-1, temp);			
			}
		}
		
		try {
            PrintWriter writer = new PrintWriter("files/ArchiveOfClubsOrderedByName.txt", "UTF-8");
            for(int i = 0; i < list.size(); i++) {
          	  writer.println(list.get(i));
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
          }		
	}
	
	/**
	 * Method to generate an archive with an ordered list of partners by age
	 */
	public void listClubByAge() {
		ArrayList<Club> list = clubs;
		
		  for (int i = 0; i < list.size() - 1; i++){
		   int min = i;
		   for (int j = i + 1; j < list.size(); j++){
		    if (list.get(j).calculateAge() < list.get(min).calculateAge()){
		     min = j;
		    }
		   }
		   if (i != min){
		    Club aux= list.get(i);
		    list.set(i, list.get(min));
		    list.set(min, aux);
		   }
		  }
		 
		  try {
	            PrintWriter writer = new PrintWriter("files/ArchiveOfClubssOrderedByAge.txt", "UTF-8");
	            for(int i = 0; i < list.size(); i++) {
	          	  writer.println(list.get(i));
	            }
	            writer.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	          }
	}
	
	/**
	 * Method to generate an archive with an ordered list of clubs by pets type
	 */
	public void listClubByPetsType() {
		
		ArrayList<Club> list = clubs;

		for(int i = 1; i < list.size(); i++) {
			for(int j = i; j > 0 && list.get(j-1).getPetsType().compareTo(list.get(j).getPetsType()) > 0; j--) {
				
				Club temp = list.get(j);
				list.set(j, list.get(j-1));
				list.set(j-1, temp);			
			}
		}
		
		try {
            PrintWriter writer = new PrintWriter("files/ArchiveOfClubsOrderedByPetsType.txt", "UTF-8");
            for(int i = 0; i < list.size(); i++) {
          	  writer.println(list.get(i));
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
          }		
	}
	
	/**
	 * Method to generate an archive with an ordered list of clubs by pets
	 * @param idClub - club's ID
	 */
	public String orderByPets(String idClub) {
		String msj = "El club no esta registrado";
		boolean esta = false;
		
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(idClub.equals(clubs.get(i).getId())) {
				esta = true;
				msj = "Se ha generado el listado";
				clubs.get(i).orderByPets();		
			}
		}		
		return msj;
	}
	
	/**
	 * Method to generate an archive with an ordered list of clubs
	 */
	public void clubsList() {
		
        try {
          PrintWriter writer = new PrintWriter("files/ArchiveOfClubs.txt", "UTF-8");
          for(int i = 0; i < clubs.size(); i++) {
        	  writer.println(clubs.get(i));
          }
          writer.close();
        } catch (Exception e) {
          e.printStackTrace();
          }
	}
	
	/**
	 * Method to generate an archive with an ordered list of pets by ID
	 * @param clubID - club's ID
	 * @param partID - partner's ID
	 */
	public void listPetByID(String clubID, String partID) {
		boolean esta = false;
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(clubID.equals(clubs.get(i).getId())) {
				esta = true;
				clubs.get(i).listPetByID(partID);
			}
		}
	}
	
	/**
	 * Method to generate an archive with an ordered list of pets by name
	 * @param clubName - club's ID
	 * @param partName - partner's ID
	 */
	public void listPetByName(String clubName, String partName) {
		boolean esta = false;
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(clubName.equals(clubs.get(i).getId())) {
				esta = true;
				clubs.get(i).listPetByName(partName);
			}
		}
	}
	
	/**
	 * Method to generate an archive with an ordered list of pets by type
	 * @param clubType - club's ID
	 * @param partType - partner's ID
	 */
	public void listPetByType(String clubType, String partType) {
		boolean esta = false;
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(clubType.equals(clubs.get(i).getId())) {
				esta = true;
				clubs.get(i).listPetByAge(partType);
			}
		}
	}
	
	/**
	 * Method to generate an archive with an ordered list of pets by age
	 * @param clubAge - club's ID
	 * @param partAge - partner's ID
	 */
	public void listPetByAge(String clubAge, String partAge) {
		boolean esta = false;
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(clubAge.equals(clubs.get(i).getId())) {
				esta = true;
				clubs.get(i).listPetByAge(partAge);
			}
		}
	}
	
	/**
	 * Method to generate an archive with an ordered list of pets by gender
	 * @param clubGender - club's ID
	 * @param partGender - partner's ID
	 */
	public void listPetByGender(String clubGender, String partGender) {
		boolean esta = false;
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(clubGender.equals(clubs.get(i).getId())) {
				esta = true;
				clubs.get(i).listPetByGender(partGender);
			}
		}
	}
	
	/**
	 * Method to generate an archive with an ordered list of partners by ID
	 * @param pClubID - club's ID
	 */
	public void listPartnerByID(String pClubID) {
		boolean esta = false;
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(pClubID.equals(clubs.get(i).getId())) {
				esta = true;
				clubs.get(i).listPartnerByID();
			}
		}
	}
	
	/**
	 * Method to generate an archive with an ordered list of partners by name
	 * @param pClubName - club's ID
	 */
	public void listPartnerByName(String pClubName) {
		boolean esta = false;
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(pClubName.equals(clubs.get(i).getId())) {
				esta = true;
				clubs.get(i).listPartnerByName();
			}
		}
	}
	
	/**
	 * Method to generate an archive with an ordered list of partners by last name
	 * @param pClubLastName - club's ID
	 */
	public void listPartnerByLastName(String pClubLastName) {
		boolean esta = false;
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(pClubLastName.equals(clubs.get(i).getId())) {
				esta = true;
				clubs.get(i).listPartnerByLastName();
			}
		}
	}
	
	/**
	 * Method to generate an archive with an ordered list of partners by favorite pet
	 * @param pClubFavoritePet - club's ID
	 */
	public void listPartnerByFavoritePet(String pClubFavoritePet) {
		boolean esta = false;
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(pClubFavoritePet.equals(clubs.get(i).getId())) {
				esta = true;
				clubs.get(i).listPartnerByFavoritePet();
			}
		}
	}
	
	/**
	 * Method to generate an archive with an ordered list of partners by age
	 * @param pClubAge - club's ID
	 */
	public void listPartnerByAge(String pClubAge) {
		boolean esta = false;
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(pClubAge.equals(clubs.get(i).getId())) {
				esta = true;
				clubs.get(i).listPartnerByAge();
			}
		}
	}
	 
	public String searchClubID(String srCID) {
		String msj = "El club no esta registrado";
		ArrayList<Club> list = clubs;

		for(int i = 1; i < list.size(); i++) {
			for(int j = i; j > 0 && list.get(j-1).getId().compareTo(list.get(j).getId()) > 0; j--) {
				
				Club temp = list.get(j);
				list.set(j, list.get(j-1));
				list.set(j-1, temp);			
			}
		}
		
		long time1 = System.nanoTime();
		boolean esta = false;
		for(int i = 0; i < list.size() && !esta; i++) {
			if(srCID.equals(list.get(i).getId())) {
				esta = true;
				msj = "El club esta registrado";
			}
		}
		long time2 = System.nanoTime();
		
		long total = time2 - time1;
		
		long time3 = System.nanoTime();
		boolean esta1 = false;
		int inicio = 0;
		int fin = (list.size() -1);
		while(inicio <= fin && !esta1) {
			int medio = (inicio + fin)/2;
			if(srCID.compareTo(list.get(medio).getId()) == 0) {
				esta1 = true;
			}else if(list.get(medio).getId().compareTo(srCID) > 0) {
				fin = medio - 1;
			}else {
				inicio = medio + 1;
			}
		}
		long time4 = System.nanoTime();
		
		long total1 = time4 - time3;
		
		msj += "\n"
				+ "Tiempo de busqueda tradicional " + total + "\n"
						+ "Tiempo de busqueda binaria " + total1;
		return msj;
	}
	
	public String searchPartnerID(String srCP, String srPID) {
		String msj = "El club no esta registrado";
		boolean esta = false;
		
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(srCP.equals(clubs.get(i).getId())) {
				esta = true;
				msj = clubs.get(i).searchPartnerID(srPID);
			}
		}
		
		return msj;
	}
	
	public String searchPetName(String srCPe, String srPP, String srPeName) {
		String msj = "El club no esta registrado";
		boolean esta = false;
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(srCPe.equals(clubs.get(i).getId())) {
				esta = true;
				msj = clubs.get(i).searchPetName(srPP, srPeName);
			}
		}
		
		return msj;
	}
	
	public String serializePartnersAndPets(String idCSe) {
		String msj = "El club no esta registrado";
		boolean esta = false;
		
		for(int i = 0; i < clubs.size() && !esta; i++) {
			if(idCSe.equals(clubs.get(i).getId())) {
				esta = true;
				msj = "Se ha creado el archivo serializado";
				clubs.get(i).serializePartnersAndPets();
			}
		}
		
		return msj;
	}
	
	public void loadCSVP(String ruta, String coma) throws IOException{
		for(int i = 0; i < clubs.size(); i++) {
			clubs.get(i).loadCSVP(ruta, coma);
		}
	}
	
	public void initClubs() {
		Calendar g1 = new GregorianCalendar(2000, 7, 13);
		Club c1 = new Club("123123", "COCACOLA", g1, "Perros");
		clubs.add(c1);
		
		Calendar g2 = new GregorianCalendar(1993, 4, 13);
		Club c2 = new Club("123323", "PEPSI", g2, "Perros");
		clubs.add(c2);
		
		Calendar g3 = new GregorianCalendar(1899, 5, 3);
		Club c3 = new Club("125523", "FANTA", g3, "Perros");
		clubs.add(c3);
		
		Calendar g4 = new GregorianCalendar(1334, 6, 7);
		Club c4 = new Club("127723", "SEVENUP", g4, "Perros");
		clubs.add(c4);
		
		Calendar g5 = new GregorianCalendar(2012, 3, 1);
		Club c5 = new Club("1288823", "KOLAROMAN", g5, "Perros");
		clubs.add(c5);
	}
}//final
