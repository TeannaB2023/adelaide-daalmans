package org.howard.edu.lsp.assignment2.combination;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Combination {
	
	private ArrayList<Integer> elements =  new ArrayList<Integer>();
	private int target;
	private Set<Integer> combination = new HashSet<Integer>();
	private Set<HashSet<Integer>> combinations = new HashSet<HashSet<Integer>>;
	
	void Combination (ArrayList<Integer> elements, int target) {
		this.elements = elements;
		this.target = target;
	}
	
	void calculateCombination (){}

}
