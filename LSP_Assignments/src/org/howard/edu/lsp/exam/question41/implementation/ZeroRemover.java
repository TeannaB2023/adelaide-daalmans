package org.howard.edu.lsp.exam.question41.implementation;

import java.util.ArrayList;

public class ZeroRemover {

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
