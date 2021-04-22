package org.howard.edu.lsp.assignment7.tollbooth;

public class FordTruck implements Truck {
	// Ford truck attributes
	private Integer axles;
	private Integer total_weight; // in kilograms
	
	/** 
	 * Constructor for Ford Truck
	 * @param axles Integer that represents the number of axles on the Ford truck
	 * @param total_weight Integer that represents the weight of the Ford in kilograms
	 * */
	public FordTruck (Integer axles, Integer total_weight) {
		this.axles = axles;
		this.total_weight = total_weight;
	}
	
	/** 
	 * Returns the total weight of the Ford object
	 * 
	 * */
	@Override
	public Integer getTotalWeight() {
		// TODO Auto-generated method stub
		return this.total_weight;
	}
	
	/** 
	 * Returns the number of axles of the Ford object
	 * 
	 * */
	@Override
	public Integer getAxles() {
		// TODO Auto-generated method stub
		return this.axles;
	}

}
