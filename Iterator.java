/**
 * An interface that forces implementors to implement
 * hasNext and next methods
 * @author Jonathan Terry
 *
 */
public interface Iterator {
	public boolean hasNext();
	public Object next();
}
