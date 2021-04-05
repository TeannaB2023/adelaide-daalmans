package org.howard.edu.lsp.assignment6.junit;

/**
 * 
 */

import java.util.Arrays;
import java.util.List;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

/**
 * @author barre
 *
 */
class IntegerSetTest {
	
	IntegerSet standard = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
	IntegerSet single = new IntegerSet(Arrays.asList(-5));
	IntegerSet three1 = new IntegerSet(Arrays.asList(5, 1, 15));
	IntegerSet three2 = new IntegerSet(Arrays.asList(3, 4, 5));
	IntegerSet empty = new IntegerSet(Arrays.asList());

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		standard = new IntegerSet(Arrays.asList(1,2,3,4,5,6));
		single = new IntegerSet(Arrays.asList(-5));
		three1 = new IntegerSet(Arrays.asList(5, 1, 15));
		three2 = new IntegerSet(Arrays.asList(3, 4, 5));
		empty = new IntegerSet(Arrays.asList());
	}

	@Test
	@DisplayName("Test cases for clear")
	void clearTest() {
		standard.clear();
		assertEquals(Arrays.asList(), standard.getSet());
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
