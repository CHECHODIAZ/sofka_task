package taller1semana1_softka;

import java.util.ArrayList;
   
   /**
    * This is a task for cantera 2 sofka university
    * @author Sergio Diaz
    *
    */

public class Fruit {
	
	/**
	 * Fruit's name
	 */
	public String name;
	
	/**
	 * Fruit's weight around
	 */
	private Float averageWeight;
	
	/**
	 * Fruit's colors, it could be as many as it has
	 */
	public ArrayList<String> colors;
	
	/**
	 * get fruit's color built
	 * @return
	 * a arraylist with several colors
	 */
	public ArrayList<String> getColors() {
		return colors;
	}
	/**
	 * set fruit's color built it
	 * @param color
	 * accept as param a String
	 */
	public void setColor(String color) {
		ArrayList<String> newcolors = new ArrayList<String>();
		newcolors.add(color);
		this.colors = newcolors;
		
	}
	
	

}
