package taller1semana1_softka;

/**
 * This is a task for cantera 2 sofka university
 * @author Sergio Diaz
 *
 */
public class Store {
	
	/**
	 * address where is located the store
	 */
	public String address;
	
	/**
	 * What kind of products the store is selling
	 */
	private String type;
	
	/**
	 * How many employes the store has.
	 */
	protected Integer employes;
    
	/**
	 * get what type of is the store
	 * @return
	 * a String with de type
	 */
	public String getType() {
		return type;
	}
    /**
     * set a store type
     * @param type
     * a String as param
     */
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	

}
