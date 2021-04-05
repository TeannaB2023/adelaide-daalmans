/**
 * 
 */
package org.howard.edu.lsp.assignment4.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author barre
 *
 */
class Assignment4Test {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		IntegerSet standard1 = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		IntegerSet single1 = new IntegerSet(Arrays.asList(-5));
		IntegerSet three1 = new IntegerSet(Arrays.asList(5, 1, 15));
		IntegerSet three2 = new IntegerSet(Arrays.asList(3, 4, 5));
		IntegerSet empty = new IntegerSet(Arrays.asList());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		IntegerSet standard1 = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		IntegerSet single1 = new IntegerSet(Arrays.asList(-5));
		IntegerSet three1 = new IntegerSet(Arrays.asList(5, 1, 15));
		IntegerSet three2 = new IntegerSet(Arrays.asList(3, 4, 5));
		IntegerSet empty = new IntegerSet(Arrays.asList());
	}

	@Test
	void clearTest() {
		fail("Not yet implemented");
	}
	
	@Test
	void lengthTest() {
		fail("Not yet implemented");
	}
	@Test
	void equalsTest() {
		fail("Not yet implemented");
	}
	@Test
	void containsTest() {
		fail("Not yet implemented");
	}
	@Test
	void largestTest() {
		fail("Not yet implemented");
	}
	@Test
	void smallestTest() {
		fail("Not yet implemented");
	}
	@Test
	void addTest() {
		fail("Not yet implemented");
	}
	@Test
	void removeTest() {
		fail("Not yet implemented");
	}
	@Test
	void unionTest() {
		fail("Not yet implemented");
	}
	@Test
	void intersectTest() {
		fail("Not yet implemented");
	}
	@Test
	void diffTest() {
		fail("Not yet implemented");
	}
	@Test
	void isEmptyTest() {
		fail("Not yet implemented");
	}
	@Test
	void toStringTest() {
		fail("Not yet implemented");
	}


	






}
