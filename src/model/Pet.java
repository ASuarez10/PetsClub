
package model;
import java.io.*;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Pet implements Serializable, Comparable<Pet>{

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
	private int day, month, year;
	/**
	 * Pet's gender
	 */
	private int gender;
	/**
	 * Pet's type
	 */
	private String type;
	
	Calendar fNacimiento = new GregorianCalendar(year, month, day);
	
	  
	//Constructor

	
	/**
	 * Constructor of Pet's class
	 * @param id - Pet's identification
	 * @param name - Pet's name
	 * @param fNacimiento - Pet's birth date
	 * @param gender - Pet's gender
	 * @param type - Pet's type
	 */
	
	public Pet(String id, String name, Calendar fNacimiento, int gender, String type) {
		super();
		this.id = id;
		this.name = name;
		this.fNacimiento = fNacimiento;
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
	 * Method to calculate the pet's age
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
	 * Method to have the pet's information
	 * @return pet's info
	 */
	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", gender="
				+ gender + ", type=" + type + ", birth date=" + fNacimiento + "]";
	}

	@Override
	public int compareTo(Pet a) {
		return name.compareToIgnoreCase(a.getName());
	}

	
	
	
}//final
