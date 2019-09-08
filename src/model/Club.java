package model;
import java.io.PrintWriter;
import java.util.ArrayList;


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
	private String creationDate;
	/**
	 * Club's pets type
	 */
	private String petsType;
	
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
		 * @param creationDate - Club's creation date
		 * @param date - Club's pets type
		 */
	  public Club(String id, String name, String creationDate, String petsType) {
		  this.id = id;
		  this.name = name;
		  this.creationDate = creationDate;
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
	 * Method to give the attribute creationDate
	 * @return creationDate
	 */
	public String getCreationDate() {
		return creationDate;
	}

	/**
	 * Method to modify the attribute creationDate
	 * @param creationDate - new creation date
	 */
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
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
	
	//numberOfPartners
	
	public int numberOfPartners() {
		return partners.size();
	}
	
	//partnersList
	
	@Override
	public String toString() {
		return "Club [id=" + id + ", name=" + name + ", creationDate=" + creationDate + ", petsType=" + petsType + "]";
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

	public void partnersList() {
		
	}
	
	//petsList
	
	public void petsList() {
		
	}
	
}//final
