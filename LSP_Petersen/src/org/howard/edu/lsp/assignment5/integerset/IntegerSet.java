package org.howard.edu.lsp.assignment5.integerset;

import java.util.ArrayList;
import java.util.List;

/**@author Siroun Petersen
	@since/10/25/21
 */

//import java.until.Arrays;


/**
 * A Java class that is able to clear, add, or remove an element to a list.
 * Additional functions can calculate remove, union, intersection, difference, contains, largest, smallest, and isEmpty.
 */


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
	
	
	/** 
	 * @return Returns the length of the set*/
	public int length() {
		return integerset.size();
	}; 
	
	
	
	
	/** 
	 * @return true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	 * @param b holds second set 
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
	 * @param value; user chosen integer for comparison 
	 * @return true if value is in the list, false if not 
	 */
	public boolean contains(int value) {
		int i = 0;
		for(i = 0; i < integerset.size(); i ++) {
			if (value == integerset.get(i)) {
				return true;
			}

		}
		return false;
	};    
	
	
	
	
	
	
	/**
	 *  @return the largest item in the set; 
	 *  Throws a IntegerSetException if the set is empty 
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
	
	
	
	
	
	/** @return the smallest item in the set; 
	 * Throws a IntegerSetException if the set is empty
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
	 * @param item to be added
	 * Adds an item to the set or does nothing it already there	
	 */
 	public void add(int item) {
 		boolean seen = false;
 		
 		for (int i = 0; i < integerset.size(); i ++) {
 			if(integerset.get(i) == item) {
 				seen = true;
 			}
 		}
 		
 		if (seen == false){
 			integerset.add(item);
 		}
 		
 	}

 	
 	
 	
 	
 	
	/**
	 * @param item holds item to remove
	 *  Removes an item from the set or does nothing if not there
	 */
	public void remove(int item) {
		for(int i = 0; i < integerset.size(); i ++) {
			
			if (integerset.get(i) == item) {
				integerset.remove(i);
			}
		}
	};  

	
	
	
	
	
	/** unionizes the sets
	 * @param intSetb holds the second set
	 */
	public void union(IntegerSet intSetb) {
		List<Integer> lst = intSetb.GetList();
		List<Integer> unionlist = new ArrayList<Integer>();
		
		unionlist.addAll(integerset);
		unionlist.addAll(lst);
		
		System.out.println(unionlist);

	};
	
	
	
	
	/**
	 *  finds set intersection
	 * @param intSetb holds second list
	 */
	public void intersect(IntegerSet intSetb) {
		List<Integer> lst = intSetb.GetList();
		
		integerset.retainAll(lst);
		
		System.out.println(integerset);
	}
	
	
	
	
	
	/**
	 * finds set difference
	 * @param intSetb holds second list
	 */
	public void diff(IntegerSet intSetb) {
		// set difference, i.e. s1 - s2
		
		List<Integer> lst = intSetb.GetList();
		
		integerset.removeAll(lst);
		
		System.out.println(integerset);
		
	}
	
	
	
	
	/**
	 *  @return true if the set is empty, false otherwise
	 */
	boolean isEmpty(){
		if (integerset.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	};
	
	
	
	
	/**
	 * @return String representation of the set
	 */
	public String toString() {
		
		return integerset.toString();
		
	};	// return String representation of your set
	
	
	public class IntegerSetException extends Exception {
	}
	
	
	public List<Integer> GetList() {
		return integerset;
	}
	
	}
