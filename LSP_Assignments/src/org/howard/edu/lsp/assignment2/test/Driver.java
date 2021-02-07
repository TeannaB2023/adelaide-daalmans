package org.howard.edu.lsp.assignment2.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.howard.edu.lsp.assignment2.combination.Combination;

/**
 * The adding combination program will be run and tested here  
 * @author barre 
 * aka Teanna Barrett
 */

public class Driver {
	
	/**
	   * Initiates Combination object and calls the calculateCombination method (Example of Polymorphism).
	   *
	   * @param elements lists of the starting elements that can be added together
	   * @param target integer for the target sum for all the combination matches
	   * 
	   * @return combinations Set which contains unordered lists of combination indices (refer to return value
	   * in calculateCombination method in Combinaion.java)
	   */
	public static HashSet<ArrayList<Integer>> calculateCombination(ArrayList<Integer> elements, int target) {
		Combination combination = new Combination(elements, target);
		return combination.calculateCombination();
	}

	public static void main(String[] args) {
		// Local variables for tests
		Integer inputTarget;
		ArrayList<Integer> inputElements;
		Set<ArrayList<Integer>> solution;
		
		// Test 1 inputs
		inputElements = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		inputTarget = 6;
		solution = calculateCombination(inputElements, inputTarget);
		System.out.printf("Input list: %s Input target: %s and Output combinations: %s\n", inputElements, inputTarget, solution);
		
		// Test 2 inputs
		inputElements = new ArrayList<Integer>(Arrays.asList(5,5,15,10));
		inputTarget = 15;
		solution = calculateCombination(inputElements, inputTarget);
		System.out.printf("Input list: %s Input target: %s and Output combinations: %s\n", inputElements, inputTarget, solution);
		
		// Test 3 inputs
		inputElements = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		inputTarget = -3;
		solution = calculateCombination(inputElements, inputTarget);
		System.out.printf("Input list: %s Input target: %s and Output combinations: %s\n", inputElements, inputTarget, solution);
		
		// Test 4 inputs
		inputElements = new ArrayList<Integer>();
		inputTarget = 6;
		solution = calculateCombination(inputElements, inputTarget);
		System.out.printf("Input list: %s Input target: %s and Output combinations: %s\n", inputElements, inputTarget, solution);
		
		// Test 5 inputs
		inputElements = new ArrayList<Integer>(Arrays.asList(1,-1,3,-3,5,-5));
		inputTarget = 0;
		solution = calculateCombination(inputElements, inputTarget);
		
		System.out.printf("Input list: %s Input target: %s and Output combinations: %s\n", inputElements, inputTarget, solution);
		
	}

}
