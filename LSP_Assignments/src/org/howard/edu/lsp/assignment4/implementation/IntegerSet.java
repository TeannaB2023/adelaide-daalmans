package org.howard.edu.lsp.assignment4.implementation;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
	
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>();

		// Clears the internal representation of the set
	public void clear() {
		this.set.clear();
	}

	// Returns the length of the set
	public int length() {
		return this.set.size();
	} // returns the length

	/*
	 * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	*/
	public boolean equals(IntegerSet b) {
		if (this.set.size() != b.set.size()) {
			return false;
		}
		for (int i = 0; i < this.set.size(); i++) {
			if (b.set.contains(this.set.get(i))){
				return false;
			}
		}
		return true;
	} 

	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		return this.set.contains(value);
	}    

	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest() throws IntegerSetException {
		try {
			if (this.set.size() == 0) {
			// Can put exception here
				return 0;
			} else if (this.set.size() == 1) {
				return this.set.get(0);
			}
			int largest = this.set.get(0);
			for (int i = 1; i < this.set.size(); i++) {
				if (this.set.get(i) > largest) {
					largest = this.set.get(i);
				}
			}
			return largest;
		} catch (IntegerSetException integerIssue) {
			System.out.println(integerIssue.message);	
		}
	} 

	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest() throws IntegerSetException {
		try {
			if (this.set.size() == 0) {
			// Can put exception here
				return 0;
			} else if (this.set.size() == 1) {
				return this.set.get(0);
			}
			int smallest = this.set.get(0);
			for (int i = 1; i < this.set.size(); i++) {
				if (this.set.get(i) < smallest) {
					smallest = this.set.get(i);
				}
			}
			return smallest;
		} catch (IntegerSetException integerIssue) {
			System.out.println(integerIssue.message);
		}
	}

	// Adds an item to the set or does nothing it already there	
	public void add(int item) {
		if (this.set.contains(item)) {
			return;
		}
		this.set.add(item);
	} // adds item to s or does nothing if it is in set

	// Removes an item from the set or does nothing if not there
	public void remove(int item) {
		this.set.remove(item);
	} 

	// Set union
	public void union(IntegerSet intSetb) {
		for (int i = 0; i < intSetb.set.size(); i++) {
			if (this.set.contains(intSetb.set.get(i))) {
				continue;
			}
			this.set.add(intSetb.set.get(i));
		}
	}

	// Set intersection
	public void intersect(IntegerSet intSetb) {
		for (int i = 0; i < this.set.size(); i++) {
			int set_value = this.set.get(i);
			if (intSetb.set.contains(set_value)) {
				continue;
			}
			this.set.remove(set_value);
		}
	} 

	// Set difference, i.e., s1 –s2
	public void diff(IntegerSet intSetb) {
		for (int i = 0; i < this.set.size(); i++) {
			int set_value = this.set.get(i);
			if (intSetb.set.contains(set_value)) {
				this.set.remove(set_value);
			}
		}
	} // set difference, i.e. s1 - s2

	// Returns true if the set is empty, false otherwise
	public boolean isEmpty() {
		return this.set.isEmpty();
	} 

	// Return String representation of your set
	public String toString() {
		return this.set.toString();
	}	// return String representation of your set
}

