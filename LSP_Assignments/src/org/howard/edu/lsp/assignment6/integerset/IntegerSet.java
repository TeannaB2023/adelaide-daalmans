package org.howard.edu.lsp.assignment6.integerset;

import java.util.ArrayList;
import java.util.List;

import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;

public class IntegerSet{
	// ArrayList of integers 
		private List<Integer> set = new ArrayList<Integer>();
		
		/**
		   * Constructor for IntegerSet.
		   *
		   * @param integers The list of integers to create the set in IntegerSet.  
		   */
		public IntegerSet(List<Integer> integers) {
			for (int i = 0; i < integers.size(); i++) {
				int addition = (int) integers.get(i);
				this.add(addition);
			}
		}
		
		/**
		   * Gets the ArrayList of the IntegerSet.
		   *
		   * @return this.set ArrayList of the element in an instance of the IntegerSet
		   */
		public List<Integer> getSet() {
			return this.set;
		}

		/**
		   * Clears the internal representation of the set.
		   */
		public void clear() {
			if (!this.isEmpty()) {
				this.set.clear();
			}
		}

		/**
		   * Returns the length of the set.
		   * 
		   * @return this.set.size int representation of the length for the IntegerSet
		   */
		public int length() {
			return this.set.size();
		} 

		/**
		 * Returns true if the 2 sets are equal, false otherwise;
		 * Two sets are equal if they contain all of the same values in ANY order.
		 * 
		 * @param b IntegerSet instance
		 * 
		 * @return boolean truth value of equals statement
		*/
		public boolean equals(IntegerSet b) {
			if (this.length() != b.length()) {
				return false;
			}
			for (int i = 0; i < this.length(); i++) {
				if (!(b.contains(this.set.get(i)))){
					return false;
				}
			}
			return true;
		} 

		/**
		   * Returns true if the set contains the value, otherwise false.
		   * 
		   * @param value int representation of the input value
		   * 
		   * @return boolean truth value for the contains statement
		   */
		public boolean contains(int value) {
			return this.set.contains(value);
		}    

		/**
		   * Returns the largest item in the set; Throws a IntegerSetException if the set is empty.
		   * 
		   * @return largest int value of the largest element in an instance of an IntegerSet
		   */
		public int largest() throws IntegerSetException {
			if (this.isEmpty()) {
				throw new IntegerSetException("IntegerSetException: The list is empty so the largest number cannot be found");
			} else if (this.length() == 1) {
				return this.set.get(0);
			}
			int largest = this.set.get(0);
			for (int i = 1; i < this.length(); i++) {
				if (this.set.get(i) > largest) {
					largest = this.set.get(i);
				}
			}
			return largest;
		} 

		/**
		   * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty.
		   * 
		   * @return smallest int value of the smallest element in an instance of an IntegerSet
		   */
		public int smallest() throws IntegerSetException {
			if (this.isEmpty()) {
				throw new IntegerSetException("IntegerSetException: The list is empty so the smallest number cannot be found");
			} else if (this.length() == 1) {
				return this.set.get(0);
			}
			int smallest = this.set.get(0);
			for (int i = 1; i < this.length(); i++) {
				if (this.set.get(i) < smallest) {
					smallest = this.set.get(i);
				}
			}
			return smallest;
		}

		/**
		   * Adds an item to the set or does nothing it already there	.
		   * 
		   * @param item int representation of integer to potentially add to IntegerSet instance
		   */
		public void add(int item) {
			if (!(this.contains(item))) {
				this.set.add(item);
			}
			
		}
	 
		/**
		   * Removes an item from the set or does nothing if not there	.
		   * 
		   * @param item int representation of integer to potentially remove to IntegerSet instance
		   */
		public void remove(int item) {
			int position = this.set.indexOf(item);
			this.set.remove(position);
			
		} 
	 
		/**
		   * Set union (aka inclusive or). The result now becomes the value of the IntegerSet value
		   * 
		   * @param intSetb IntegerSet instance being compared
		   */
		public void union(IntegerSet intSetb) {
			List<Integer> setB = intSetb.getSet();
			if (intSetb.isEmpty()) {
				return;
			}
			for (int i = 0; i < intSetb.length(); i++) {
				if (this.contains(setB.get(i))) {
					continue;
				}
				this.add(setB.get(i));
			}
		}

		/**
		   * Set intersection (aka AND). The result now becomes the value of the IntegerSet 
		   * 
		   * @param intSetb IntegerSet instance being compared
		   */
		public void intersect(IntegerSet intSetb) {
			List<Integer> intersectingSet = new ArrayList<Integer>();
			for (int i = 0; i < this.length(); i++) {
				int set_value = this.set.get(i);
				if (intSetb.contains(set_value)) {
					intersectingSet.add(set_value);
				}
			}
			this.set = intersectingSet;
		} 

		/**
		   * Set difference (aka exclusive OR). The result now becomes the value of the IntegerSet 
		   * 
		   * @param intSetb IntegerSet instance being compared
		   */
		public void diff(IntegerSet intSetb) {
			for (int i = 0; i < this.length(); i++) {
				int set_value = this.set.get(i);
				if (intSetb.contains(set_value)) {
					this.remove(set_value);
				}
			}
		}
	 
		/**
		   *  Returns true if the set is empty, false otherwise
		   * 
		   * @return boolean truth value of the is empty statement
		   */
		public boolean isEmpty() {
			return this.set.isEmpty();
		} 

		/**
		   * Return String representation of your set 
		   * 
		   * @return string representation of object
		   */
		public String toString() {
			return this.set.toString();
		}

}
