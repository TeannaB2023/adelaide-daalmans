package org.howard.edu.lsp.exam.question41.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.howard.edu.lsp.exam.question41.implementation.ZeroRemover;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RemoveZeroTest {
	// Initialize ZeroRemover object
	ZeroRemover remover = new ZeroRemover();
	
	// Initialize integer ArrayLists to be used 
	ArrayList<Integer> emptyList = new ArrayList<Integer>(Arrays.asList());
	ArrayList<Integer> zerosList = new ArrayList<Integer>(Arrays.asList(0, 0, 0));
	ArrayList<Integer> standardList = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 0));
	ArrayList<Integer> noZeroList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
	

	@Test
	@DisplayName("Tests for remove zero methods for lists an empty list, list of only zeros,"
			+ " a list with non-zero and zero integers, and a list with not zeros ")
	void testRemoveZero() {
		assertEquals(Arrays.asList(), remover.removeZeros(emptyList));
		assertEquals(Arrays.asList(), remover.removeZeros(zerosList));
		assertEquals(Arrays.asList(1, 2, 4), remover.removeZeros(standardList));
		assertEquals(Arrays.asList(1, 2, 3, 4), remover.removeZeros(noZeroList));
	}

}
