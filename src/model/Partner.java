
package model;
import java.io.*;
import java.util.ArrayList;

public class Partner implements Serializable {

	//Attributes
	
	private String id;	
	private String name;
	private String lastName;
	private String date;
	private String favoritePet;
	
	//Relations
	
	  private ArrayList<Pet>pets;
	  
	//Constructor
	  
	  public Partner(String id, String name, String lastName, String date, String favoritePet) {
		  this.id = id;
		  this.name = name;
		  this.lastName = lastName;
		  this.date = date;
		  this.favoritePet = favoritePet;
		  pets = new ArrayList<Pet>();
	  }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFavoritePet() {
		return favoritePet;
	}

	public void setFavoritePet(String favoritePet) {
		this.favoritePet = favoritePet;
	}

	public ArrayList<Pet> getPets() {
		return pets;
	}

	public void setPets(ArrayList<Pet> pets) {
		this.pets = pets;
	}
	
	//addPet
	
	public void addPet(Pet nP) {
		
	}
	
	//deletePet
	
	public void deletePet(String petToDelete) {
		
	}
	
}//final
