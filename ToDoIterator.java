/**
 * An iterator that iterates over ToDo objects in a ToDo[]
 * @author Jonathan Terry
 *
 */
public class ToDoIterator implements Iterator {
	private ToDo[] todos;
	private int position = 0;
	
	/**
	 * A parameterized constructor. 
	 * Creates a new Array of ToDos for an instance of this class
	 * @param todos: An array of ToDos
	 */
	public ToDoIterator(ToDo[] todos) {
		this.todos = todos;
	}
	
	/**
	 * Returns false if there are not more ToDos in todos[]. Returns true if there are;
	 * @return boolean: returns true if the next value in the array is not null, false otherwise
	 */
	public boolean hasNext() {
		if(position >= todos.length || todos[position] == null) {
			return false;
		}
		
		return true;
	}
	
	/**
	 * Returns a ToDo object representing the next ToDo in the todos[]
	 * @return ToDo: Returns the next ToDo object in the todos array, null if there is none
	 */
	public ToDo next() {
		ToDo todo = todos[position];
		position += 1;
		return todo;
	}
	

}
