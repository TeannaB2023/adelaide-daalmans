package org.howard.edu.lsp.assignment2.combination;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
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
		this.elements = elements;
		this.target = target;
	}
	
	/**
	   * Finds and Calculates the list of element indices whose elements add up to equal the target number.
	   *
	   * @param None However, all the variable that are used are all the instance variables and the sum method 
	   */
	public HashSet<ArrayList<Integer>> calculateCombination(){
		
		for (int i = 0; i < this.elements.size(); i++) {
			this.combination.clear();
			int initialElement = this.elements.get(i);
			this.combination.add(i);
			if (initialElement == this.target) {
				this.combinations.add(this.copyCombo());
				continue;
			} else if (initialElement > this.target || i == this.elements.size() -1) {
				continue;
			}
			int j = i + 1;
			while(j < this.elements.size()) {
				for(int k = j; k < this.elements.size(); k++) {
					int addingElement = this.elements.get(k);
					if (addingElement + this.sum() == this.target) {
						this.combination.add(k);
						this.combinations.add(this.copyCombo());
						this.combination.clear();
						this.combination.add(i);
						break;
					} else if (addingElement + this.sum() > this.target) {
						continue;
					} else {
						this.combination.add(k);
					}
				}
				j++;
				this.combination.clear();
				this.combination.add(i);
			}
			System.out.println(this.combination);
		}
		return this.combinations;
	}
	
	/**
	   * Calculates the sum of the values that are indexed in the combination list
	   *
	   * @param None However, all the variable that are used are the instance variables (combination and elements)
	   */
	private int sum() {
		if (this.combination.size() == 1) {
			return this.elements.get(this.combination.get(0));
		}
		
		int sum = 0;
		//ListIterator<Integer> indexListIterator = this.combination.listIterator();
		for (int i = 0; i < this.combination.size(); i++) {
			sum = sum + this.elements.get(this.combination.get(i));
		}
		return sum;
	}
	
	private ArrayList<Integer> copyCombo(){
		ArrayList<Integer> copyCombo = new ArrayList<Integer>(this.combination.size());
		for(Integer i : this.combination){
	        copyCombo.add(i);
	    }
		return copyCombo;
	}
}
