package taller1semana1_softka;

/**
 * This is a task for cantera 2 sofka university
 * @author Sergio Diaz
 *
 */
public class BankAccounts {
	/**
	 * unique number of a account
	 */
	private int accountNumber;
	
	/**
	 * make account up, specficing if that account is on or off
	 */
	
	protected boolean activated;
	
	/**
	 * get status of a account
	 * @return
	 * boolean true if account is on or false if account is off
	 */
	public boolean getActivated() {
		return activated;
	}
	
	/**
	 * set status of a account
	 * @param activated
	 * accept a boolean param with as status
	 */
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	
}
