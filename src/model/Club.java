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
	
}
