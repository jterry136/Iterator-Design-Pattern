/**
 * A class that describes a Contractor's ToDo list for a job
 * @author Jonathan Terry
 *
 */

import java.util.ArrayList;

public class ContractorToDoList {
	private String address;
	private ToDo[] todos;
	private int count = 0;;
	
	/**
	 * A parameterized constructor. Sets the value of address variable to the provide parameter's value
	 * @param address: A String describing the physical location of the job
	 */
	public ContractorToDoList(String address) {
		this.address = address;
		this.todos = new ToDo[2];
	}
	
	/**
	 * Adds a new ToDo object to todos[]. Does not add if array is full.
	 * @param title: A String describing the name of the ToDo task
	 * @param description: A String describing the steps for the ToDo
	 * @param price: A double describing the price of the ToDo
	 * @param contact: A String describing the point of contact for the ToDo task
	 * @param supplies: A list of supplies needed to complete the ToDo
	 */
	public void addToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		ToDo todo = new ToDo(title, description, price, contact, supplies);
		while(todos[count] != null) {
			count++;
		}
		if(count%2 == 0) {
			todos = growArray(todos);
		}
		todos[count] = todo;
		
	}
	
	/**
	 * Creates and returns a new ToDoIterator object
	 * @return ToDoIterator: An iterator used to iterate over an array of ToDo objects
	 */
	public ToDoIterator createIterator() {
		return new ToDoIterator(todos);
	}
	
	/**
	 * Returns the string value of the address variable
	 * @return String: A String describing the address (physical location) of where the ToDo needs to happen
	 */
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * Calculates and returns the total cost of the project as a double
	 * @return double: A double describing the total cost for all ToDos in the ToDoList
	 */
	public double getTotalCost() {
		double totalCost = 0.0;
		for(int i = 0; i < todos.length; i++) {
			if(todos[i] != null) {
				totalCost += todos[i].getPrice();
			}
			
		}
		return totalCost;
	}
	
	/**
	 * Creates a new array with double the length of the parameter.
	 * Adds data from the parameter to the new array, then returns the new array.
	 * @param todos: The current array of todo objects
	 * @return ToDo[]: A new array containing values from the previous array
	 */
	private ToDo[] growArray(ToDo[] todos) {
		ToDo[] grownToDos = new ToDo[(todos.length) * 2];
		for(int i = 0; i < todos.length; i++) {
			grownToDos[i] = todos[i];
		}
		return grownToDos;
	}

}
