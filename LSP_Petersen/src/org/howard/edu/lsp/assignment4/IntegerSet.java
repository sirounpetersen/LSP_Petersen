package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

//import java.until.Arrays;

public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> integerset = new ArrayList<Integer>();
	

	
	// Default Constructor
	public IntegerSet() {
	/** 
	 * constructor
	 */
	
		this.integerset=integerset;
	};

	
	/**
	 * Clears the internal representation of the set
	 */
	public void clear() {
		
		
		
		integerset.clear();
	};
	
	/** Returns the length of the set*/
	public int length() {
		
		return integerset.size();
	}; 
	
	
	
	
	/** Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	*/
	public boolean equals(IntegerSet b) {
		List<Integer>integerset2 = b.integerset;
		
		if (integerset.size() == integerset2.size()){
			return true;
		}
		
		else {
			return false;
		}
	}; 
	
	/** Returns true if the set contains the value, otherwise false
	 * 
	 * @param value
	 * @return
	 */
	public boolean contains(int value) {
		int i = 0;
		for(i = 0; i < integerset.size(); i ++) {
			if (value == integerset[i]) {
				return true;
			}
			else {
				return false;
			}
		}
	};    
	
	/**
	 *  Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	 */
	public int largest() throws IntegerSetException {
		if (integerset.size() == 0) {
			IntegerSetException e = new IntegerSetException();
			throw e;
		}
		
		int high = 0;
		
		for(int i = 0; i < integerset.size(); i++) {
			if (integerset.get(i) > high) {
				high = integerset.get(i);
			}
		}
		return high;
	}; 
	
	/** Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	 * 
	 */
	public int smallest() throws IntegerSetException {
		if (integerset.size() == 0) {
			IntegerSetException e = new IntegerSetException();
			throw e;
		}
		int i = 0;
		int low = integerset.get(i);
		
		for(i = 0; i < integerset.size(); i++) {
			if (integerset.get(i) < low) {
				low = integerset.get(i);
			}
		}
		return low;
	};
	
	/** 
	 * Adds an item to the set or does nothing it already there	
	 */
 	public void add(int item) {
 		boolean seen = false;
 		
 		for (int i = 0; i < integerset.size(); i ++) {
 			if(integerset.get(i) == item) {
 				seen = true;
 			}
 		}
 		
 		if (seen = false){
 			integerset.add(item);
 		}
 		
 	};

	/**
	 *  Removes an item from the set or does nothing if not there
	 * @param item
	 */
	public void remove(int item) {
		for(int i = 0; i < integerset.size(); i ++) {
			
			if (integerset.get(i) == item) {
				integerset.remove(i);
			}
		}
	};  
	//Throws a IntegerSetException of the set is empty
	
	// Set union
	public void union(IntegerSet intSetb) {
		List<Integer> tmep = integerset2.getlist();
		
	};
	
	// Set intersection
	public void intersect(IntegerSet intSetb) {
		
	}; 
	
	// Set difference, i.e., s1 �s2
	public void diff(IntegerSet intSetb) {
		// set difference, i.e. s1 - s2
	}
	
	// Returns true if the set is empty, false otherwise
	boolean isEmpty(){
		if (integerset.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	};
	
	// Return String representation of your set
	public String toString() {
		new array = 
		for(int i = 0; i<integerset.size(); i++) {
			String a = integerset.get(i).toString();
			
		}
		
	};	// return String representation of your set
	}