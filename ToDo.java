/**
 * A class that describes an item in a Contractor's ToDo list.
 * @author Jonathan Terry
 *
 */

import java.util.ArrayList;

public class ToDo {
	private String title;
	private String description;
	private double price;
	private String contact;
	private ArrayList<String> supplies;
	
	/**
	 * A constructor for ToDo
	 * Each instance variable is set to its respective value taken in as a parameter
	 * @param title A string representing the name of the ToDo item
	 * @param description A string description of what will be done for the ToDo 
	 * @param price A number representing the cost of the ToDo
	 * @param contact A String representing the point of contact for the ToDo
	 * @param supplies A List of supplies needed for the job
	 */
	public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.contact = contact;
		this.supplies = supplies;
	}
	
	/**
	 * 
	 * @return double: The value of the price variable, representing the cost of the job
	 */
	public double getPrice() {
		return this.price;
	}
	
	/**
	 * Creates and returns a readable representation of the class as a String
	 * @return String: A String representation of this class and its variables' values
	 */
	public String toString() {
		String suppliesFormatted = "";
		for(String supply : supplies) {
			suppliesFormatted += "- " + supply + "\n";
		}
		return "\n***** " + this.title + " *****\n" +
				this.description + "\n" + 
				"Business Contact: " + this.contact + "\n" + 
				"Supply List:\n" + suppliesFormatted  + 
				"Price: " + this.price;
	}

}
