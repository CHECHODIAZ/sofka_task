package taller1semana1_softka;

/**
 * This is a task for cantera 2 sofka university
 * @author Sergio Diaz
 *
 */
public class Animal {
	
	/**
	 * name of an animal
	 */
	private String name;
	/**
	 * tell if the animal has hair
	 */
	public Boolean hairly;
	/**
	 * tell if the animal is a domestic type
	 */
	public boolean domestic;
	
	/**
	 * get an Animal name
	 * @return
	 * String with a animal name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * set an Animal name
	 * @param name
	 * String 
	 */
	public void setName(String name) {
		this.name = name;
	}

}
