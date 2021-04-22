package org.howard.edu.lsp.exam.question41.implementation;

import java.util.ArrayList;

public class ZeroRemover {
	/**
	 * Returns an ArrayList of Integers that doesn't contain 0
	 * 
	 * @param inputList ArrayList<Integer> that may contain zeros 
	 * that need to be removed
	 * 
	 * @return result ArrayList<Integer> an out of place replica 
	 * of the inputList but doesn't contain any zeros
	 * */
	public ArrayList<Integer> removeZeros(ArrayList<Integer> inputList) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (inputList.isEmpty()) {
			return inputList;
		}
		for (Integer element: inputList) {
			if (element != 0) {
				result.add(element);
			}
		}
		return result;
	}
}
