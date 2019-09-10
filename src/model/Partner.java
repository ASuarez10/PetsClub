
package model;
import java.io.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.io.PrintWriter;

public class Partner implements Serializable, Comparable<Partner>, Comparator<Partner> {

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
		String msj= "Partner [id=" + id + ", name=" + name + ", last name=" + lastName + ", birth date=" + fNacimiento + ", favorite pet="
				+ favoritePet + ", pets= ";
		
		for(int i = 0; i < pets.size(); i++) {
			msj += pets.get(i) + ", ";
		}
		
		msj += "]";
		
		return msj;
	}
	
	/**
	 * Method to generate an archive with an ordered list of pets by ID
	 */
	public void listPetByID() {
		ArrayList<Pet> list = pets;
		
		  for (int i = 0; i < list.size() - 1; i++){
		   int min = i;
		   for (int j = i + 1; j < list.size(); j++){
		    if (list.get(j).getId().compareTo(list.get(min).getId()) < 0){
		     min = j;
		    }
		   }
		   if (i != min){
		    Pet aux= list.get(i);
		    list.set(i, list.get(min));
		    list.set(min, aux);
		   }
		  }
		 
		  try {
	            PrintWriter writer = new PrintWriter("files\\ArchiveOfPetsOrderedByID.txt", "UTF-8");
	            for(int i = 0; i < list.size(); i++) {
	          	  writer.println(list.get(i));
	            }
	            writer.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	          }
	}
	
	/**
	 * Method to generate an archive with an ordered list of pets by Name
	 */
	public void listPetByName() {
		ArrayList<Pet> list = pets;
		
		  for (int i = 0; i < list.size() - 1; i++){
		   int min = i;
		   for (int j = i + 1; j < list.size(); j++){
		    if (list.get(j).getName().compareTo(list.get(min).getName()) < 0){
		     min = j;
		    }
		   }
		   if (i != min){
		    Pet aux= list.get(i);
		    list.set(i, list.get(min));
		    list.set(min, aux);
		   }
		  }
		 
		  try {
	            PrintWriter writer = new PrintWriter("files\\ArchiveOfPetsOrderedByName.txt", "UTF-8");
	            for(int i = 0; i < list.size(); i++) {
	          	  writer.println(list.get(i));
	            }
	            writer.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	          }
	}
	
	/**
	 * Method to generate an archive with an ordered list of pets by type
	 */
	public void listPetByType() {
		ArrayList<Pet> list = pets;
		
		  for (int i = 0; i < list.size() - 1; i++){
		   int min = i;
		   for (int j = i + 1; j < list.size(); j++){
		    if (list.get(j).getType().compareTo(list.get(min).getType()) < 0){
		     min = j;
		    }
		   }
		   if (i != min){
		    Pet aux= list.get(i);
		    list.set(i, list.get(min));
		    list.set(min, aux);
		   }
		  }
		 
		  try {
	            PrintWriter writer = new PrintWriter("files\\ArchiveOfPetsOrderedByType.txt", "UTF-8");
	            for(int i = 0; i < list.size(); i++) {
	          	  writer.println(list.get(i));
	            }
	            writer.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	          }
	}
	
	/**
	 * Method to generate an archive with an ordered list of pets by age
	 */
	public void listPetByAge() {
		ArrayList<Pet> list = pets;
		
		  for (int i = 0; i < list.size() - 1; i++){
		   int min = i;
		   for (int j = i + 1; j < list.size(); j++){
		    if (list.get(j).calculateAge() < list.get(min).calculateAge()){
		     min = j;
		    }
		   }
		   if (i != min){
		    Pet aux= list.get(i);
		    list.set(i, list.get(min));
		    list.set(min, aux);
		   }
		  }
		 
		  try {
	            PrintWriter writer = new PrintWriter("files\\ArchiveOfPetsOrderedByAge.txt", "UTF-8");
	            for(int i = 0; i < list.size(); i++) {
	          	  writer.println(list.get(i));
	            }
	            writer.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	          }
	}
	
	/**
	 * Method to generate an archive with an ordered list of pets by gender
	 */
	public void listPetByGender() {
		ArrayList<Pet> list = pets;
		
		  for (int i = 0; i < list.size() - 1; i++){
		   int min = i;
		   for (int j = i + 1; j < list.size(); j++){
		    if (list.get(j).getGender() < list.get(min).getGender()){
		     min = j;
		    }
		   }
		   if (i != min){
		    Pet aux= list.get(i);
		    list.set(i, list.get(min));
		    list.set(min, aux);
		   }
		  }
		 
		  try {
	            PrintWriter writer = new PrintWriter("files\\ArchiveOfPetsOrderedByGender.txt", "UTF-8");
	            for(int i = 0; i < list.size(); i++) {
	          	  writer.println(list.get(i));
	            }
	            writer.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	          }
	}
	
	public String searchPetName(String srPeName) {
		String msj = "El club no esta registrado";
		ArrayList<Pet> list = pets;

		for(int i = 1; i < list.size(); i++) {
			for(int j = i; j > 0 && list.get(j-1).getName().compareTo(list.get(j).getName()) > 0; j--) {
				
				Pet temp = list.get(j);
				list.set(j, list.get(j-1));
				list.set(j-1, temp);			
			}
		}
		
		long time1 = System.nanoTime();
		boolean esta = false;
		for(int i = 0; i < list.size() && !esta; i++) {
			if(srPeName.equals(list.get(i).getName())) {
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
			if(srPeName.compareTo(list.get(medio).getName()) == 0) {
				esta1 = true;
			}else if(list.get(medio).getName().compareTo(srPeName) > 0) {
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

	@Override
	public int compareTo(Partner o) {
		return id.compareToIgnoreCase(o.getId());
	}

	@Override
	public int compare(Partner o1, Partner o2) {
		return o1.getId().compareToIgnoreCase(o2.getId());
	}
}//final
