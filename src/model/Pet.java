
package model;
import java.io.*;

public class Pet implements Serializable{

	//Constants
	
	/**
     * Constant used to indicate that the pet is male
     */
	public static final int MALE = 1;
	/**
     * Constant used to indicate that the pet is female
     */
	public static final int FEMALE = 2;

	
	//Attributes
	
	/**
	 * Pet's identification
	 */
	private String id;	
	/**
	 * Pet's name
	 */
	private String name;
	/**
	 * Pet's birth date
	 */
	private String date;
	/**
	 * Pet's gender
	 */
	private int gender;
	/**
	 * Pet's type
	 */
	private String type;
	
	//Relations
	
	/**
	 * Is the relation from Pet to Partner
	 */
	
	private Partner part;
	  
	//Constructor

	
	/**
	 * Constructor of Pet's class
	 * @param id - Pet's identification
	 * @param name - Pet's name
	 * @param date - Pet's birth date
	 * @param date - Pet's gender
	 * @param date - Pet's type
	 */
	public Pet(String id, String name, String date, int gender, String type) {
		  this.id = id;
		  this.name = name;
		  this.date = date;
		  this.gender = gender;
		  this.type = type;
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
	 * Method to give the attribute gender
	 * @return gender
	 */
	public int getGender() {
		return gender;
	}

	/**
	 * Method to modify the attribute gender
	 * @param gender - new gender
	 */
	public void setGender(int gender) {
		this.gender = gender;
	}

	/**
	 * Method to give the attribute type
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Method to modify the attribute type
	 * @param type - new type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Method to give the relation part
	 * @return part
	 */
	 public Partner getPart() {
		return part;
	}

	 /**
		 * Method to modify the relation part
		 * @param part - new part
		 */
	public void setPart(Partner part) {
		this.part = part;
	}
	
}//final
