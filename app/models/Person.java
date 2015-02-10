/**
 * 
 */
package models;

/**
 * @author pc
 *
 */
public class Person {
	public String firstname;
    public String lastname;
    /**
     * 
     * @param firstname
     * @param lastname
     */
	public Person(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public Person() {
		super();
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
    
    
}
