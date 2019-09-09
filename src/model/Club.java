package model;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Club {

	//Attributes
	
	/**
	 * Club's identification
	 */
	private String id;	
	/**
	 * Club's name
	 */
	private String name;
	/**
	 * Club's creation date
	 */
	private int day, month, year;
	/**
	 * Club's pets type
	 */
	private String petsType;
	
	Calendar fNacimiento = new GregorianCalendar(year, month, day);
	
	//Relations
	
	/**
	 * ArrayList of partners
	 */
	  private ArrayList<Partner>partners;
	  
	//Constructor
	  
	  /**
		 * Constructor of Club's class
		 * @param id - Club's identification
		 * @param name - Club's name
		 * @param fNacimiento - Club's creation date
		 * @param date - Club's pets type
		 */
	  public Club(String id, String name, Calendar fNacimiento, String petsType) {
		  this.id = id;
		  this.name = name;
		  this.fNacimiento = fNacimiento;
		  this.petsType = petsType;
		  partners = new ArrayList<Partner>();
	  }

	  /**
		 * Method to give the attribute id
		 * @return id
		 */
	public String getId() {
		return id;
	}

	/**
	 * Method to modify the attribute id
	 * @param id - new identification
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Method to give the attribute name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method to modify the attribute name
	 * @param name - new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method to give the attribute fNacimiento
	 * @return creation date
	 */
	public Calendar getfNacimiento() {
		return fNacimiento;
	}

	/**
	 * Method to modify the attribute fNacimiento
	 * @param fNacimiento - new creation date
	 */
	public void setfNacimiento(Calendar fNacimiento) {
		this.fNacimiento = fNacimiento;
	}

	/**
	 * Method to give the attribute petsType
	 * @return petsType
	 */
	public String getPetsType() {
		return petsType;
	}

	/**
	 * Method to modify the attribute petsType
	 * @param petsType - new pets type
	 */
	public void setPetsType(String petsType) {
		this.petsType = petsType;
	}

	/**
	 * Method to give the ArrayList partners
	 * @return partners
	 */
	public ArrayList<Partner> getPartners() {
		return partners;
	}

	/**
	 * Method to modify the partners list
	 * @param partners - new partners list
	 */
	public void setPartners(ArrayList<Partner> partners) {
		this.partners = partners;
	}
	
	/**
	 * Method to give the attribute day
	 * @return day
	 */
	public int getDay() {
		return day;
	}
	
	/**
	 * Method to modify the attribute day
	 * @param day - new day
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * Method to give the attribute month
	 * @return month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Method to modify the attribute month
	 * @param month - new month
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * Method to give the attribute year
	 * @return year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Method to modify the attribute year
	 * @param year - new year
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * Method to calculate the club's age
	 * @return years
	 */
	public int calculateAge() {
        Calendar cDate = Calendar.getInstance();


        int years = cDate.get(Calendar.YEAR) - fNacimiento.get(Calendar.YEAR);

        int months = cDate.get(Calendar.MONTH) - fNacimiento.get(Calendar.MONTH);

        int days = cDate.get(Calendar.DAY_OF_MONTH) - fNacimiento.get(Calendar.DAY_OF_MONTH);

        if(months < 0 || (months==0 && days < 0)) { 

            years--;

        }
        return years;
    }
	
	//addPartner
	
	/**
	 * Method to add a partner
	 * @param nPartner - Partner to add
	 */
	public void addPartner(Partner nPartner) {
		
		boolean esta = false;
		
		for(int i = 0; i < partners.size() && !esta; i++) {
			if(nPartner.getId().equals(partners.get(i).getId())) {
				esta = true;
			}
		}
		
		if(esta == true) {
			partners.add(nPartner);
		}
	}
	
	//deletePartner
	
	/**
	 * Method to delete a partner
	 * @param partToDelete - Partner's ID or name to delete
	 */
	public void deletePartner(String partToDelete) {
		
		boolean esta = false;
		
		for(int i = 0; i < partners.size() && !esta; i++) {
			if(partToDelete.equals(partners.get(i).getId())) {
				esta = true;
				partners.remove(i);
			}
		}
		
	}
	
	//addPet
	
	/**
	 * Method to add a pet
	 * @param idD - owner's id
	 * @param nwPe - Pet to add
	 */
	public void addPet(String idD, Pet nwPe) {
		
		boolean esta = false;
		
		for(int i = 0; i < partners.size() && !esta; i++) {
			if(idD.equals(partners.get(i).getId())) {
				esta = true;			
				partners.get(i).addPet(nwPe);
			}
		}
		
	}
	
	/**
	 * Method to delete a pet
	 * @param idP - owner's id
	 * @param petToDelete - Pet's id or name to delete
	 */
	public void deletePet(String idP, String petToDelete) {
		
		boolean esta = false;
		
		for(int i = 0; i < partners.size() && !esta; i++) {
			if(idP.equals(partners.get(i).getId())) {
				esta = true;
				partners.get(i).deletePet(petToDelete);
			}else if(idP.equals(partners.get(i).getName())) {
				esta = true;
				partners.get(i).deletePet(petToDelete);
			}
		}	
	}
	
	/**
	 * Method to have the number of partners in the club
	 * @return  number of partners
	 */
	
	public int numberOfPartners() {
		return partners.size();
	}
	
	/**
	 * Method to have the club's information
	 * @return club's info
	 */
	
	@Override
	public String toString() {
		return "Club [id=" + id + ", name=" + name + ", creation date=" + fNacimiento + ", petsType=" + petsType + "]";
	}
	
	/**
	 * Method to have an ordered list of number of pets
	 * @return ordered list
	 */
	
	public void orderByPets(){
		ArrayList<Partner> list = partners;
		
        for(int i = 0; i < list.size() - 1; i++){

            for(int j = 0; j < list.size() - 1; j++){

                if (list.get(j).numberOfPets() < list.get(j+1).numberOfPets()){

                    Partner tmp = list.get(j+1);

                    list.set(j+1, list.get(j));

                    list.set(j, tmp);

                }

            }

        }
        
        try {
            PrintWriter writer = new PrintWriter("files\\ArchiveOfPartners.txt", "UTF-8");
            for(int i = 0; i < list.size(); i++) {
          	  writer.println(list.get(i));
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
          }     
	}

	/**
	 * Method to generate an archive with an ordered list of partners by ID
	 */
	public void listPartnerByID() {
		ArrayList<Partner> list = partners;
		
		  for (int i = 0; i < list.size() - 1; i++){
		   int min = i;
		   for (int j = i + 1; j < list.size(); j++){
		    if (list.get(j).getId().compareTo(list.get(min).getId()) < 0){
		     min = j;
		    }
		   }
		   if (i != min){
		    Partner aux= list.get(i);
		    list.set(i, list.get(min));
		    list.set(min, aux);
		   }
		  }
		 
		  try {
	            PrintWriter writer = new PrintWriter("files\\ArchiveOfPartnersOrderedByID.txt", "UTF-8");
	            for(int i = 0; i < list.size(); i++) {
	          	  writer.println(list.get(i));
	            }
	            writer.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	          }
	}
	
	/**
	 * Method to generate an archive with an ordered list of partners by name
	 */
	public void listPartnerByName() {
		ArrayList<Partner> list = partners;
		
		  for (int i = 0; i < list.size() - 1; i++){
		   int min = i;
		   for (int j = i + 1; j < list.size(); j++){
		    if (list.get(j).getName().compareTo(list.get(min).getName()) < 0){
		     min = j;
		    }
		   }
		   if (i != min){
		    Partner aux= list.get(i);
		    list.set(i, list.get(min));
		    list.set(min, aux);
		   }
		  }
		 
		  try {
	            PrintWriter writer = new PrintWriter("files\\ArchiveOfPartnersOrderedByName.txt", "UTF-8");
	            for(int i = 0; i < list.size(); i++) {
	          	  writer.println(list.get(i));
	            }
	            writer.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	          }
	}
	
	/**
	 * Method to generate an archive with an ordered list of partners by last name
	 */
	public void listPartnerByLastName() {
		ArrayList<Partner> list = partners;
		
		  for (int i = 0; i < list.size() - 1; i++){
		   int min = i;
		   for (int j = i + 1; j < list.size(); j++){
		    if (list.get(j).getLastName().compareTo(list.get(min).getLastName()) < 0){
		     min = j;
		    }
		   }
		   if (i != min){
		    Partner aux= list.get(i);
		    list.set(i, list.get(min));
		    list.set(min, aux);
		   }
		  }
		 
		  try {
	            PrintWriter writer = new PrintWriter("files\\ArchiveOfPartnersOrderedByLastName.txt", "UTF-8");
	            for(int i = 0; i < list.size(); i++) {
	          	  writer.println(list.get(i));
	            }
	            writer.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	          }
	}
	
	/**
	 * Method to generate an archive with an ordered list of partners by favorite pet
	 */
	public void listPartnerByFavoritePet() {
		ArrayList<Partner> list = partners;
		
		  for (int i = 0; i < list.size() - 1; i++){
		   int min = i;
		   for (int j = i + 1; j < list.size(); j++){
		    if (list.get(j).getFavoritePet().compareTo(list.get(min).getFavoritePet()) < 0){
		     min = j;
		    }
		   }
		   if (i != min){
		    Partner aux= list.get(i);
		    list.set(i, list.get(min));
		    list.set(min, aux);
		   }
		  }
		 
		  try {
	            PrintWriter writer = new PrintWriter("files\\ArchiveOfPartnersOrderedByFavoritePet.txt", "UTF-8");
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
	public void listPetByAge() {
		ArrayList<Partner> list = partners;
		
		  for (int i = 0; i < list.size() - 1; i++){
		   int min = i;
		   for (int j = i + 1; j < list.size(); j++){
		    if (list.get(j).calculateAge() < list.get(min).calculateAge()){
		     min = j;
		    }
		   }
		   if (i != min){
		    Partner aux= list.get(i);
		    list.set(i, list.get(min));
		    list.set(min, aux);
		   }
		  }
		 
		  try {
	            PrintWriter writer = new PrintWriter("files\\ArchiveOfPartnersOrderedByAge.txt", "UTF-8");
	            for(int i = 0; i < list.size(); i++) {
	          	  writer.println(list.get(i));
	            }
	            writer.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	          }
	}
	
}//final
