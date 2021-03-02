package org.howard.edu.lsp.assignment4.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;

public class DriverClass4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Local variables for tests
		IntegerSet integerSet1;
		IntegerSet integerSet2;
		ArrayList<Integer> inputElements;
		int target_item;
				
		// Test for clearing IntegerSet
		inputElements = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		integerSet1 = new IntegerSet(inputElements);
		System.out.printf("Test 1: Clear integer set\nSet Before: %s ", integerSet1.toString());
		integerSet1.clear();
		System.out.printf("Set After: %s\n", integerSet1.toString());
				
		// Test 2 for presenting the set length
		inputElements = new ArrayList<Integer>(Arrays.asList(5,5,15,10));
		integerSet1 = new IntegerSet(inputElements);
		int length = integerSet1.length();
		String expectedLength = "3";
		System.out.printf("Test 2: Output length of integer set\nInteger set: %s\nExpected output: %s Actual output: %s", integerSet1.toString(), expectedLength, length);
				
		/** Test 3 checking if 2 integer sets are equal (False and True example)
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
		System.out.printf("Input list: %s Input target: %s and Output combinations: %s\n", inputElements, inputTarget, solution);*/
				
	}

}
