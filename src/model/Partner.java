/**
 * 
 */
package model;
import java.io.*;
import java.util.ArrayList;


/**
 * @author Alejandro Suarez
 *
 */
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
	
}
