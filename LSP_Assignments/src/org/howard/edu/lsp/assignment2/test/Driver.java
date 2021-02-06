package org.howard.edu.lsp.assignment2.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.howard.edu.lsp.assignment2.combination.Combination;

/**
 * The adding program will be run and tested here  
 * @author barre 
 * aka Teanna Barrett
 */

public class Driver {
	
	public static HashSet<ArrayList<Integer>> calculateCombination(ArrayList<Integer> elements, int target) {
		Combination combination = new Combination(elements, target);
		return combination.calculateCombination();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> inputElements = new ArrayList<Integer>();
			inputElements.add(1);
			inputElements.add(2);
			inputElements.add(3);
			inputElements.add(4);
			inputElements.add(5);
			inputElements.add(6);
		Integer inputTarget = 6;
		Set<ArrayList<Integer>> solution = calculateCombination(inputElements, inputTarget);
		System.out.println(solution);

	}

}
