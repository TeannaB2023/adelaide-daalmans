package org.howard.edu.lsp.assignment7.tollbooth;

public class AustinTollBooth implements TollBooth {
	// Attributes for Austin Tollbooth
	private Integer totalTrucks;
	private Integer totalReceipts;
	
	public AustinTollBooth() {
		this.totalTrucks = 0;
		this.totalReceipts = 0;
	}
	/** 
	 * Returns the calculate the toll receipt for a single truck
	 * also increments the totalTrucks attribute and adds total to totalReceipts
	 * @param truck Truck object that needs the receipt calculated
	 * */
	@Override
	public void calculateToll(Truck truck) {
		Integer axles = truck.getAxles();
		Integer weight = truck.getTotalWeight();
		Integer axleCost = axles * 5;
		Integer weightCost = (weight/500) * 10;
		
		Integer totalReceipt = axleCost + weightCost;
		
		System.out.println("Truck arrival - Axles: " + axles + " Total weight: " + weight + " Toll due: " + totalReceipt);
		
		this.totalTrucks++;
		this.totalReceipts = this.totalReceipts + totalReceipt;
	}
	
	/** 
	 * Prints the current data of the toll booth's receipts and trucks served
	 * 
	 * */
	@Override
	public void displayData() {
		System.out.println("*** Collecting receipts  ***\r\n"
				+ "Totals since the last collection - Receipts: " + this.totalReceipts + " Trucks: " + this.totalTrucks + "\r\n");
	}
	
	/** 
	 * Clear the toll booth data by reseting the totalReceipts and 
	 * totalTrucks to zero
	 * 
	 * */
	@Override
	public void reset() {
		this.totalReceipts = this.totalTrucks = 0;
	}

}
