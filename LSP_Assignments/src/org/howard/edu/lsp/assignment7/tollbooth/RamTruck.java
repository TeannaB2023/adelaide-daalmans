package org.howard.edu.lsp.assignment7.tollbooth;

public class RamTruck implements Truck {
	// Attributes for Ram truck
	private Integer axles;
	private Integer total_weight; // in kilograms
	
	public RamTruck (Integer axles, Integer total_weight) {
		this.axles = axles;
		this.total_weight = total_weight;
	}
	
	@Override
	public Integer getTotalWeight() {
		// TODO Auto-generated method stub
		return this.total_weight;
	}

	@Override
	public Integer getAxles() {
		// TODO Auto-generated method stub
		return this.axles;
	}

}
