package org.howard.edu.lsp.assignment4.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;

public class DriverClass4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Local variables for tests
		IntegerSet integerSet1 = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		IntegerSet integerSet2 = new IntegerSet(Arrays.asList(5,5,15,10));
		IntegerSet integerSet3 = new IntegerSet(Arrays.asList(-5));
		IntegerSet integerSet4 = new IntegerSet(Arrays.asList());
		boolean solution1, solution2, solution3;
		int input1, input2;
				
		// Test for clear method of IntegerSet
				
		// Test 2 for length method of IntegerSet (Non-repeating and repeating input)
				
		// Test 3 for equal method of IntegerSet (False and True)
				
		// Test 4 for contains method of IntegerSet (False and True)
		input1 = 6;
		input2 = -5;
		solution1 = integerSet1.contains(input1);
		solution2 = integerSet1.contains(input2);
		System.out.printf("Test 4: Contains method of IntegerSet\n4a:%s contains %s? %s\n 4b: %s contains %s? %s\n", integerSet1.toString(), input1, solution1, integerSet1.toString(), input2, solution2);
				
		// Test 5 for largest method of IntegerSet (Single entry, empty set, more than one entry)	
		System.out.printf("Test 5: Largest method of IntegerSet\n5a: Largest value in single element set %s is %s\n5b: Largest value in empty set is %s\n5c: largest value of standard set %s is %s\n", integerSet4.toString(), integerSet4.largest(), integerSet3.toString(), integerSet3.largest(), integerSet2.toString(), integerSet2.largest());
		
		// Test 6 for smallest method of IntegerSet (Single entry, empty set with IntegerSet exception, more than one entry)
		System.out.printf("Test 5: Smallest method of IntegerSet\n5a: Smallest value in single element set %s is %s\n5b: Smallest value in empty set is %s\n5c: Smallest value of standard set %s is %s\n", integerSet4.toString(), integerSet4.smallest(), integerSet3.toString(), integerSet3.smallest(), integerSet2.toString(), integerSet2.smallest());
		
		// Test 7 Add method (new integer and repeated integer)
		input1 = 1;
		input2 = 0;
		integerSet1.add(input1);
		System.out.printf("Test 6: Add method for Integer Set\n6a: %s Input target: %s and Output combinations: %s\n", inputElements, inputTarget, solution);
		integerSet1.add(input2);	
		System.out.printf("Input list: %s Input target: %s and Output combinations: %s\n", inputElements, inputTarget, solution);
		
		// Test 8 Remove method (present integer and not-there integer)
		System.out.printf("Input list: %s Input target: %s and Output combinations: %s\n", inputElements, inputTarget, solution);
		
		// Test 9 Union method (standard sets, empty parameter set, sets with shared values)
		inputElements = new ArrayList<Integer>(Arrays.asList(1,-1,3,-3,5,-5));
		inputTarget = 0;
		solution = calculateCombination(inputElements, inputTarget);	
		System.out.printf("Input list: %s Input target: %s and Output combinations: %s\n", inputElements, inputTarget, solution);
		
		// Test 10 Intersection method (standard sets, no intersection parameter set, empty parameter set)
		inputElements = new ArrayList<Integer>(Arrays.asList(1,-1,3,-3,5,-5));
		inputTarget = 0;
		solution = calculateCombination(inputElements, inputTarget);	
		System.out.printf("Input list: %s Input target: %s and Output combinations: %s\n", inputElements, inputTarget, solution);
				
	}
	
	public void clearTest(IntegerSet integerSet) {
		System.out.printf("Test 1: Clear IntegerSet\nSet Before: %s ", integerSet.toString());
		integerSet.clear();
		System.out.printf("Set After: %s\n", integerSet.toString());
	}
	
	public void lengthTest(IntegerSet repeatSet, IntegerSet standardSet) {
		int expected_repeat_length = repeatSet.getSet().size();
		int expected_standard_length = standardSet.getSet().size();
		System.out.printf("Test 2: Length method of IntegerSet\nInteger sets: %s and %s\nExpected outputs: %s and %s\nActual outputs: %s and %s\n", repeatSet.toString(), standardSet.toString(), expected_repeat_length, expected_standard_length, repeatSet.length(), standardSet.length());
	}
	
	public void equalTest(IntegerSet integerSet1, IntegerSet integerSet2) {
		int solution1 = integerSet1.equals(integerSet2);
		int solution2 = integerSet1.equals(integerSet1);
		System.out.printf("Test 3: Equals method of IntegerSet\3a: %s and %s are equal? %s\n3b: %s and %s are equal? %s\n", integerSet1.toString(), integerSet2.toString(), solution1, integerSet1.toString(), integerSet1.toString(), solution2);
	
	}

}
