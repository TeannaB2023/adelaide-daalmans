package org.howard.edu.lsp.assignment7.tollbooth;

public interface TollBooth {
	/** 
	 * Returns the calculate the toll receipt for a single truck
	 * also increments the totalTrucks attribute and adds total to totalReceipts
	 * @param truck Truck object that needs the receipt calculated
	 * */
	public void calculateToll(Truck truck);
	
	/** 
	 * Prints the current data of the toll booth's receipts and trucks served
	 * 
	 * */
	public void displayData();
	
	/** 
	 * Clear the toll booth data by reseting the totalReceipts and 
	 * totalTrucks to zero
	 * 
	 * */
	public void reset();
}
