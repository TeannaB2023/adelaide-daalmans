package org.howard.edu.assignment7.tollbooth;

public class AustinTollBooth implements TollBooth {
	// Attributes for Austin Tollbooth
	private Integer totalTrucks = 0;
	private Integer totalReciepts = 0;

	@Override
	public void calculateToll(Truck truck) {
		// TODO Auto-generated method stub
		Integer axles = truck.getAxles();
		Integer weight = truck.getTotalWeight();
		Integer axleCost = axles * 5;
		Integer weightCost = ( weight/ 500) * 10;
		
		Integer totalReciept = axleCost + weightCost;
		
		System.out.printf("Truck arrival - Axles: %s Total weight: %s Toll due: %s",axles, weight, totalReciept);
		
		this.totalTrucks++;
		this.totalReciepts = this.totalReciepts + totalReciept;
	}

	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		System.out.printf("*** Collecting receipts  ***\r\n"
				+ "Totals since the last collection - Receipts: %s Trucks: %s\r\n", this.totalReciepts, this.totalTrucks);
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		this.totalReciepts = this.totalTrucks = 0;
	}

}
