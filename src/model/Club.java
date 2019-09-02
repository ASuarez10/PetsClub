package model;
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

	public void setPartners(ArrayList<Partner> partners) {
		this.partners = partners;
	}
	
	//addPartner
	
	/**
	 * Method to add a partner
	 * @param nPartner - Partner to add
	 */
	public void addPartner(Partner nPartner) {
		
	}
	
	//deletePartner
	
	/**
	 * Method to delete a partner
	 * @param partToDelete - Partner's ID or name to delete
	 */
	public void deletePartner(String partToDelete) {
		
	}
	
	//addPet
	
	public void addPet(Partner nwP, Pet nwPe) {
		
	}
	
	//findPartner
	
	public Partner findPartner(String fact) {
		
		Partner p = null;
		
		
		return p;
	}
	
	//partnersList
	
	public void partnersList() {
		
	}
	
	//petsList
	
	public void petsList() {
		
	}
	
}//final
