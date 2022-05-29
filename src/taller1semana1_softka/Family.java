package taller1semana1_softka;

/**
 * This is a task for cantera 2 sofka university
 * @author Sergio Diaz
 *
 */
public class Family {
	/**
	 * number of memebers
	 */
	public int members;
	
	/**
	 * the tallest in the family
	 */
	private String tallest;
	
	/**
	 * number of siblings
	 */
	protected int siblings;
	
	/**
	 * get the tallest in the family
	 * @return
	 * String with a person name
	 */
	public String getTallest() {
		return tallest;
	}
	
	/**
	 * set a name of family member who is the tallest
	 * @param tallest
	 * accept a String with a person name
	 */
	public void setTallest(String tallest) {
		this.tallest = tallest;
	}

}
