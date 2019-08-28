package model;
import java.util.ArrayList;


public class Club {

	//Attributes
	
	private String id;	
	private String name;
	private String creationDate;
	private String petsType;
	
	//Relations
	
	  private ArrayList<Partner>partners;
	  
	//Constructor
	  
	  public Club(String id, String name, String creationDate, String petsType) {
		  this.id = id;
		  this.name = name;
		  this.creationDate = creationDate;
		  this.petsType = petsType;
		  partners = new ArrayList<Partner>();
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

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getPetsType() {
		return petsType;
	}

	public void setPetsType(String petsType) {
		this.petsType = petsType;
	}

	public ArrayList<Partner> getPartners() {
		return partners;
	}

	public void setPartners(ArrayList<Partner> partners) {
		this.partners = partners;
	}
	
	//addPartner
	
	public void addPartner(Partner nPartner) {
		
	}
	
	//deletePartner
	
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
