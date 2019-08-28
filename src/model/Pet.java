/**
 * 
 */
package model;
import java.io.*;

/**
 * @author Alejandro Suarez
 *
 */
public class Pet implements Serializable{

	//Constants
	
	public static final int MALE = 1;
	public static final int FEMALE = 2;

	
	//Attributes
	
	private String id;	
	private String name;
	private String date;
	private int gender;
	private String type;
	
	  
	//Constructor
	  
	  public Pet(String id, String name, String date, int gender, String type) {
		  this.id = id;
		  this.name = name;
		  this.date = date;
		  this.gender = gender;
		  this.type = type;
	  }
	
}
