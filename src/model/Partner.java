
package model;
import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
	 * Partner's birth date
	 */
	private int day, month, year;
	/**
	 * Partner's favorite pet
	 */
	private String favoritePet;
	
	//Relations
	
	/**
	 * ArrayList with pets
	 */
	  private ArrayList<Pet>pets;
	  
	  Calendar fNacimiento = new GregorianCalendar(year, month, day);
	  
	//Constructor
	  
	  /**
		 * Constructor of Partner's class
		 * @param id - Partner's identification
		 * @param name - Partner's name
		 * @param lastname - Partner's last name
		 * @param fNacimiento - Partner's date
		 * @param favoritePet - Partner's favorite pet
		 */
	  public Partner(String id, String name, String lastName, Calendar fNacimiento, String favoritePet) {
		  this.id = id;
		  this.name = name;
		  this.lastName = lastName;
		  this.fNacimiento = fNacimiento;
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
	
	/**
	 * Method to give the attribute fNacimiento
	 * @return birth date
	 */
	public Calendar getfNacimiento() {
		return fNacimiento;
	}

	/**
	 * Method to modify the attribute fNacimiento
	 * @param fNacimiento - new birth date
	 */
	public void setfNacimiento(Calendar fNacimiento) {
		this.fNacimiento = fNacimiento;
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
			if(petToDelete.equals(pets.get(i).getName())) {
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
	
	/**
	 * Method to calculate the partner's age
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
	
	
	/**
	 * Method to have the partner's information
	 * @return partner's info
	 */
	
	@Override
	public String toString() {
		String msj= "Partner [id=" + id + ", name=" + name + ", last name=" + lastName + ", age=" + calculateAge() + ", favorite pet="
				+ favoritePet + ", pets= ";
		
		for(int i = 0; i < pets.size(); i++) {
			msj += pets.get(i) + ", ";
		}
		
		msj += "]";
		
		return msj;
	}
	
}//final
