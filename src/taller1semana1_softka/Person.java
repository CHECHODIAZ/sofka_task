package taller1semana1_softka;

import java.util.Date;


/**
 * This is a task for cantera 2 sofka university
 * @author Sergio Diaz
 *
 */

public class Person {
	
	/**
	 * Person's name
	 */
	public String name;
	
	/**
	 * Person's last name
	 */
	public String lastName1;
	
	/**
	 * Person's next last name
	 */
	public String lastName2;
	
	/**
	 * Person's birthday, give full date.
	 */
	public Date dateBirth;
	
	/**
	 * Person's heigth, how tall is a person
	 */
	public Float heigth;
	
	
	/**
	 * get person's name built
	 * @return
	 * String with person's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * set person's name to built it
	 * @param name
	 * it accepts a String with person's name as param
	 */
	public void setName(String name) {
		this.name = name;
	}

}
