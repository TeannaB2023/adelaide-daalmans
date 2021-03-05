package org.howard.edu.lsp.assignment4.test;

import java.util.Arrays;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;

public class DriverClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Local variables for tests
		IntegerSet integerSet1 = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		IntegerSet integerSet2 = new IntegerSet(Arrays.asList(5,5,15,10));
		IntegerSet integerSet3 = new IntegerSet(Arrays.asList(-5));
		IntegerSet integerSet4 = new IntegerSet(Arrays.asList());
				
		// Test for clear method of IntegerSet
		clearTest();	
		
		// Test 2 for length method of IntegerSet (Non-repeating and repeating input)
		lengthTest(integerSet1, integerSet2);
		
		// Test 3 for equal method of IntegerSet (False and True)
		equalsTest(integerSet1, integerSet2);
		
		//Test 4 for contains method of IntegerSet (False and True)
		containsTest(integerSet1);
		
		// Test 5 for largest method of IntegerSet (Single entry, empty set, more than one entry)	
		largestTest(integerSet3, integerSet4, integerSet1);
		
		// Test 6 for smallest method of IntegerSet (Single entry, empty set with IntegerSet exception, more than one entry)
		smallestTest(integerSet3, integerSet4, integerSet1);
		
		// Test 7 Add method (new integer and repeated integer)
		addTest(integerSet1);
		
		// Test 8 Remove method (present integer and not-there integer)
		removeTest(integerSet1);
		
		// Test 9 Union method (standard sets, empty parameter set, sets with shared values)
		unionTest();
		
		// Test 10 Intersection method (standard sets, no intersection parameter set, empty parameter set)
		intersectTest();
		
		// Test 11 Difference method (standard sets, empty parameter set, sets with shared values)
		diffTest();
		
		// Test 12 isEmpty method (Empty set and Standard set)
		isEmptyTest(integerSet4, integerSet2);
		
		// Test 13 toString method (Checks the type for standard set)
		toStringTest(integerSet3);
				
	}
	
	public static void clearTest() {
		printBreak();
		IntegerSet integerSet = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		System.out.printf("Test 1: Clear IntegerSet\nSet Before: %s ", integerSet.toString());
		integerSet.clear();
		System.out.printf("Set After: %s\n", integerSet.toString());
	}
	
	public static void lengthTest(IntegerSet repeatSet, IntegerSet standardSet) {
		printBreak();
		int expected_repeat_length = repeatSet.getSet().size();
		int expected_standard_length = standardSet.getSet().size();
		System.out.printf("Test 2: Length method of IntegerSet\nInteger sets: %s and %s\nExpected outputs: %s and %s\nActual outputs: %s and %s\n", repeatSet.toString(), standardSet.toString(), expected_repeat_length, expected_standard_length, repeatSet.length(), standardSet.length());
	}
	
	public static void equalsTest(IntegerSet integerSet1, IntegerSet integerSet2) {
		printBreak();
		boolean solution1 = integerSet1.equals(integerSet2);
		boolean solution2 = integerSet1.equals(integerSet1);
		System.out.printf("Test 3: Equals method of IntegerSet\n3a: %s and %s Expected: false Actual: %s\n3b: %s and %s Expected: true Actual: %s\n", integerSet1.toString(), integerSet2.toString(), solution1, integerSet1.toString(), integerSet1.toString(), solution2);
	}
	
	public static void containsTest(IntegerSet integerSet) {
		printBreak();
		int input1 = 6;
		int input2 = -5;
		boolean solution1 = integerSet.contains(input1);
		boolean solution2 = integerSet.contains(input2);
		System.out.printf("Test 4: Contains method of IntegerSet\n4a:%s contains %s Expected: true Actual: %s\n4b: %s contains %s Expected: false Actual: %s\n", integerSet.toString(), input1, solution1, integerSet.toString(), input2, solution2);
	}
	
	public static void largestTest(IntegerSet singleSet, IntegerSet emptySet, IntegerSet standardSet) {
		printBreak();
		IntegerSet[] sets = {singleSet, emptySet, standardSet};
		String[] expecteds = {"-5", "IntegerSetExcpetion", "6"};
		System.out.printf("Test 5: Largest method of IntegerSet\n");
		
		for (int i = 0; i < 3; i++) {
			try {
			System.out.printf("5.%s: %s Expected: %s Actual: %s\n", i+1, sets[i], expecteds[i], sets[i].largest());
			
			} catch (IntegerSetException integerE) {
				System.out.printf("5.%s: %s Expected: %s Actual: %s\n", i+1, sets[i], expecteds[i], integerE.getMessage());
				
			}
		}
	}
	
	public static void smallestTest(IntegerSet singleSet, IntegerSet emptySet, IntegerSet standardSet) {
		printBreak();
		IntegerSet[] sets = {singleSet, emptySet, standardSet};
		String[] expecteds = {"-5", "IntegerSetExcpetion", "1"};
		System.out.printf("Test 6: Smallest method of IntegerSet\n");
		
		for (int i = 0; i < 3; i++) {
			try {
			System.out.printf("6.%s: %s Expected: %s Actual: %s\n", i+1, sets[i], expecteds[i], sets[i].smallest());
			
			} catch (IntegerSetException integerE) {
				System.out.printf("6.%s: %s Expected: %s Actual: %s\n", i+1, sets[i], expecteds[i], integerE.getMessage());
				
			}
		}
	}
	
	public static void addTest(IntegerSet integerSet) {
		printBreak();
		int repeat_add = 1;
		int new_add = 0;
		IntegerSet workingSet = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		workingSet.add(repeat_add);
		System.out.printf("Test 7: Add method for Integer Set\n7.1: Add %s to %s Expected: [1, 2, 3, 4, 5, 6] Actual: %s\n", repeat_add, integerSet.toString(), workingSet.toString());
		workingSet.add(new_add);	
		System.out.printf("7.2: Add %s to %s Expected: [1, 2, 3, 4, 5, 6, 0] Actual: %s\n", new_add, integerSet.toString(), workingSet.toString());
	}
	
	public static void removeTest(IntegerSet integerSet) {
		printBreak();
		int present_remove = 1;
		int new_remove = 0;
		IntegerSet workingSet = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		workingSet.remove(new_remove);
		System.out.printf("Test 8: Remove method for Integer Set\n8.1: Remove %s from %s Expected: [1, 2, 3, 4, 5, 6] Actual: %s\n", new_remove, integerSet.toString(), workingSet.toString());
		workingSet.remove(present_remove);	
		System.out.printf("8.2: Remove %s from %s Expected: [2, 3, 4, 5, 6] Actual: %s\n", present_remove, integerSet.toString(), workingSet.toString());
	}
	
	public static void unionTest() {
		printBreak();
		// standard sets
		IntegerSet standard1 = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		IntegerSet standard2 = new IntegerSet(Arrays.asList(-5));
		IntegerSet standard1copy = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		standard1copy.union(standard2);
		System.out.printf("Test 9: Union method of IntegerSet\n9.1: Standard sets %s Union %s Expected: [1, 2, 3, 4, 5, 6, -5] Actual: %s\n", standard1.toString(), standard2.toString(), standard1copy.toString());
		
		// Intersection sets
		standard1 = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		standard2 = new IntegerSet(Arrays.asList(5, 1, 15));
		standard1copy = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		standard1copy.union(standard2);
		System.out.printf("9.2: Intersecting sets %s Union %s Expected: [1, 2, 3, 4, 5, 6, 15] Actual: %s\n", standard1.toString(), standard2.toString(), standard1copy.toString());
		
		// One empty set
		standard1 = new IntegerSet(Arrays.asList(3, 4, 5));
		standard2 = new IntegerSet(Arrays.asList());
		standard1copy = new IntegerSet(Arrays.asList(3, 4, 5));
		standard1copy.union(standard2);
		System.out.printf("9.3: Empty sets %s Union %s Expected: [3, 4, 5] Actual: %s\n", standard1.toString(), standard2.toString(), standard1copy.toString());
		
	}
	
	public static void intersectTest() {
		printBreak();
		// No intersection sets
		IntegerSet standard1 = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		IntegerSet standard2 = new IntegerSet(Arrays.asList(-5));
		IntegerSet standard1copy = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		standard1copy.intersect(standard2);
		System.out.printf("Test 10: Intersect method of IntegerSet\n10.1 Non-intersecting sets: %s Intersect %s Expected: [] Actual: %s\n", standard1.toString(), standard2.toString(), standard1copy.toString());
				
		// Intersection sets
		standard1 = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		standard2 = new IntegerSet(Arrays.asList(5, 1, 15));
		standard1copy = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		standard1copy.intersect(standard2);
		System.out.printf("10.2 Intersecting sets: %s Intersect %s Expected: [1, 5] Actual: %s\n", standard1.toString(), standard2.toString(), standard1copy.toString());
				
		// One empty set
		standard1 = new IntegerSet(Arrays.asList(3, 4, 5));
		standard2 = new IntegerSet(Arrays.asList());
		standard1copy = new IntegerSet(Arrays.asList());
		standard1copy.intersect(standard2);
		System.out.printf("10.3: Empty set %s Intersect %s Expected: [] Actual: %s\n", standard1.toString(), standard2.toString(), standard1copy.toString());
				
	}
	
	public static void diffTest() {
		printBreak();
		// No Intersection sets
		IntegerSet standard1 = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		IntegerSet standard2 = new IntegerSet(Arrays.asList(-5));
		IntegerSet standard1copy = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		standard1copy.diff(standard2);
		System.out.printf("Test 11: Difference method of IntegerSet\n11.1: Standard sets %s - %s Expected: [1, 2, 3, 4, 5, 6] Actual: %s\n", standard1.toString(), standard2.toString(), standard1copy.toString());
				
		// Intersection sets
		standard1 = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		standard2 = new IntegerSet(Arrays.asList(5, 1, 15));
		standard1copy = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		standard1copy.diff(standard2);
		System.out.printf("11.2: Intersecting sets %s - %s Expected: [2, 3, 4, 6] Actual: %s\n", standard1.toString(), standard2.toString(), standard1copy.toString());
				
		// One empty set
		standard1 = new IntegerSet(Arrays.asList());
		standard2 = new IntegerSet(Arrays.asList(3, 4, 5));
		standard1copy = new IntegerSet(Arrays.asList());
		standard1copy.diff(standard2);
		System.out.printf("11.3: Empty sets %s - %s Expected: [] Actual: %s\n", standard1.toString(), standard2.toString(), standard1copy.toString());
				
	}
	
	public static void isEmptyTest(IntegerSet emptySet, IntegerSet standardSet) {
		printBreak();
		System.out.printf("Test 12: isEmpty method of IntegerSet\nInteger sets: %s and %s\nExpected outputs: true and false\nActual outputs: %s and %s\n", emptySet.toString(), standardSet.toString(), emptySet.isEmpty(), standardSet.isEmpty());
	}
	
	public static void toStringTest(IntegerSet integerSet) {
		printBreak();
		boolean result;
		if (integerSet.toString() instanceof String) {
			result = true;
		} else {
			result = false;
		}
		System.out.printf("Test 13: toString method of IntegerSet\nThe type for integerSet.toString() is a String Expected: true Actual: %s\n", result);
	}
	
	public static void printBreak() {
		System.out.println("\n--------------------\n");
	}
}
