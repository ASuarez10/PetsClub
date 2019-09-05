
package model;
import java.io.*;
import java.util.ArrayList;

public class Partner implements Serializable {

	//Attributes
	
	/**
	 * Partner's identification
	 */
	private String id;
	/**
	 * Partner's name
	 */
	private String name;
	/**
	 * Partner's last name
	 */
	private String lastName;
	/**
	 * Partner's date
	 */
	private String date;
	/**
	 * Partner's favorite pet
	 */
	private String favoritePet;
	
	//Relations
	
	/**
	 * ArrayList with pets
	 */
	  private ArrayList<Pet>pets;
	  
	//Constructor
	  
	  /**
		 * Constructor of Partner's class
		 * @param id - Partner's identification
		 * @param name - Partner's name
		 * @param lastname - Partner's last name
		 * @param date - Partner's date
		 * @param favoritePet - Partner's favorite pet
		 */
	  public Partner(String id, String name, String lastName, String date, String favoritePet) {
		  this.id = id;
		  this.name = name;
		  this.lastName = lastName;
		  this.date = date;
		  this.favoritePet = favoritePet;
		  pets = new ArrayList<Pet>();
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
	 * @param id - new id
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
	 * Method to give the attribute lastname
	 * @return lastname
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Method to modify the attribute lastname
	 * @param lastname - new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Method to give the attribute date
	 * @return date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Method to modify the attribute date
	 * @param date - new date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Method to give the attribute favoritePet
	 * @return favoritePet
	 */
	public String getFavoritePet() {
		return favoritePet;
	}

	/**
	 * Method to modify the attribute favoritePet
	 * @param favoritePet - new favorite pet
	 */
	public void setFavoritePet(String favoritePet) {
		this.favoritePet = favoritePet;
	}
	
	/**
	 * Method to give the ArrayList pets
	 * @return pets
	 */
	public ArrayList<Pet> getPets() {
		return pets;
	}

	/**
	 * Method to modify the ArrayList pets
	 * @param pets - new pets
	 */
	public void setPets(ArrayList<Pet> pets) {
		this.pets = pets;
	}
	
	//addPet
	
	/**
	 * Method to add a pet
	 * @param nP - The new pet
	 */
	public void addPet(Pet nP) {
		
		boolean esta = false;
		
		for(int i = 0; i < pets.size() && !esta; i++) {
			if(nP.getName().equals(pets.get(i).getName())) {
				esta = true;
			}
		}
		if(esta == false) {
			pets.add(nP);
		}
	}
	
	//deletePet
	
	/**
	 * Method to delete a pet
	 * @param petToDelete - ID of the pet to delete
	 */
	public void deletePet(String petToDelete) {
		
		for(int i = 0; i < pets.size(); i++) {
			if(petToDelete.equals(pets.get(i).getId())) {
				pets.remove(i);
			}else if(petToDelete.equals(pets.get(i).getName())) {
				pets.remove(i);
			}
		}
	}
	
	
	//numberOfPets
	
	/**
	 * Method to give the number of pets
	 * @return number of pets
	 */
	public int numberOfPets() {
		return pets.size();
	}

	//toString
	
	
	/**
	 * Method to have the partner's information
	 * @return partner's info
	 */
	
	@Override
	public String toString() {
		return "Partner [id=" + id + ", name=" + name + ", lastName=" + lastName + ", date=" + date + ", favoritePet="
				+ favoritePet + ", pets=" + pets + "]";
	}
	
}//final
