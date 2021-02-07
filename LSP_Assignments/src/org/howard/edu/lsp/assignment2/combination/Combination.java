package org.howard.edu.lsp.assignment2.combination;

import java.util.ArrayList;
import java.util.HashSet;


public class Combination {
	// ArrayList of elements that can be used in the combinations
	private ArrayList<Integer> elements =  new ArrayList<Integer>();
	
	// Integer that is the target value for the sum of any combination
	private Integer target;
	
	// ArrayList of the indices of elements for a possible combination. This variable will be reused
	private ArrayList<Integer> combination = new ArrayList<Integer>();
	
	// Array List of all the possible combinations based on given elements and target
	private HashSet<ArrayList<Integer>> combinations = new HashSet<ArrayList<Integer>>();
	
	 /**
	   * Creates a new Combination instance.
	   *
	   * @param elements The list of integers of available elements to get combinations from. 
	   * @param target The integer for the target sum of all the combinations. 
	   */
	public Combination (ArrayList<Integer> elements, Integer target) {
		if (elements == null || target == null) {
			this.combinations.add(null);
			return;
		}
		this.elements = elements;
		this.target = target;
	}
	
	/**
	   * Finds and Calculates the list of element indices whose elements add up to equal the target number.
	   *
	   * @param None However, all the variables that are used are all the instance variables and the sum,
	   *  resetCombo, and copyCombo methods 
	   * 
	   * @return combinations Set which contains unordered lists of combination indices
	   */
	public HashSet<ArrayList<Integer>> calculateCombination(){
		int length = this.elements.size();
		for (int i = 0; i < length; i++) {
			this.resetCombo(i);
			int initialElement = this.elements.get(i);
			if (initialElement == this.target) {
				this.combinations.add(this.copyCombo());
				continue;
			} else if (i == length -1) {
				continue;
			}
			int j = i + 1;
			while (j < length) {
				for (int k = j; k < length; k++) {
					int addingElement = this.elements.get(k);
					if (addingElement + this.sum() == this.target) {
						this.combination.add(k);
						this.combinations.add(this.copyCombo());
						this.resetCombo(i);
						break;
					} else if (addingElement + this.sum() > this.target) {
						continue;
					} else {
						this.combination.add(k);
					}
				}
				j++;
				this.resetCombo(i);
			}
		}
		return this.combinations;
	}
	
	/**
	   * Calculates the sum of the values that are indexed in the combination list.
	   *
	   * @param None However, all the variables that are used are the instance variables (combination and elements)
	   * 
	   * @return sum an integer of all the values referenced in the combination list
	   */
	private int sum() {
		if (this.combination.size() == 1) {
			return this.elements.get(this.combination.get(0));
		}
		int sum = 0;
		for (int i = 0; i < this.combination.size(); i++) {
			sum = sum + this.elements.get(this.combination.get(i));
		}
		return sum;
	}
	
	/**
	   * Makes a deep copy of the combination, the method is usually called to add a viable combo 
	   * to the combinations set.
	   *
	   * @param None However, the combination instance variable is used
	   * 
	   * @return copyCombo an ArrayList of the deep copied combination list
	   */
	private ArrayList<Integer> copyCombo(){
		ArrayList<Integer> copyCombo = new ArrayList<Integer>(this.combination.size());
		for (Integer index : this.combination){
	        copyCombo.add(index);
	    }
		return copyCombo;
	}
	
	/**
	   * Resets the combination variable to only have the starting element index.
	   *
	   * @param i the integer value of the current starting index in the combo algorithm
	   * In addition, the combination instance variable is used 
	   */
	private void resetCombo(int index) {
		this.combination.clear();
		this.combination.add(index);
	}
}
