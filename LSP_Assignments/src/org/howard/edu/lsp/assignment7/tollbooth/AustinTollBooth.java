package org.howard.edu.lsp.assignment7.tollbooth;

public class AustinTollBooth implements TollBooth {
	// Attributes for Austin Tollbooth
	private Integer totalTrucks = 0;
	private Integer totalReceipts = 0;

	@Override
	public void calculateToll(Truck truck) {
		// TODO Auto-generated method stub
		Integer axles = truck.getAxles();
		Integer weight = truck.getTotalWeight();
		Integer axleCost = axles * 5;
		Integer weightCost = (weight/500) * 10;
		
		Integer totalReceipt = axleCost + weightCost;
		
		System.out.println("Truck arrival - Axles: " + axles + " Total weight: " + weight + " Toll due: " + totalReceipt);
		
		this.totalTrucks++;
		this.totalReceipts = this.totalReceipts + totalReceipt;
	}

	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		System.out.println("*** Collecting receipts  ***\r\n"
				+ "Totals since the last collection - Receipts: " + this.totalReceipts + " Trucks: " + this.totalTrucks + "\r\n");
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		this.totalReceipts = this.totalTrucks = 0;
	}

}
