package org.howard.edu.lsp.assignment7.tollbooth;

public class RamTruck implements Truck {
	// Attributes for Ram truck
	private Integer axles;
	private Integer total_weight; // in kilograms
	
	/** 
	 * Constructor for Ram Truck
	 * @param axles Integer that represents the number of axles on the Ram truck
	 * @param total_weight Integer that represents the weight of the Ram in kilograms
	 * */
	public RamTruck (Integer axles, Integer total_weight) {
		this.axles = axles;
		this.total_weight = total_weight;
	}
	
	/** 
	 * Returns the total weight of the Ram object
	 * 
	 * */
	@Override
	public Integer getTotalWeight() {
		// TODO Auto-generated method stub
		return this.total_weight;
	}
	
	/** 
	 * Returns the number of axles of the Ram object
	 * 
	 * */
	@Override
	public Integer getAxles() {
		// TODO Auto-generated method stub
		return this.axles;
	}

}
