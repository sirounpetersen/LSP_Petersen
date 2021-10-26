package org.howard.edu.lsp.assignment5.junit;

//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
import org.howard.edu.lsp.assignment5.integerset.IntegerSet;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;



/**
 * test class for IntegerSet
 * @author Siroun Petersen
 *
 */



public class IntegerSetTest {
	private static final Object test = null;
	public IntegerSet integerset = new IntegerSet();
	private IntegerSet set1 = new IntegerSet();
	private IntegerSet set2 = new IntegerSet();
	private IntegerSet set3 = new IntegerSet();
	private IntegerSet set4 = new IntegerSet();
	private IntegerSet set5 = new IntegerSet();
	private IntegerSet set6 = new IntegerSet();
	private IntegerSet set7 = new IntegerSet();
	
	
	/*
	 * sets up different sets for testing
	 */
	
	
	public void init() {
		//set 1 
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		
		//set 2
		set2.add(12);
		set2.add(8);
		set2.add(6);
		set2.add(15);
		set2.add(16);
		set2.add(1);
		
		//set 3
		set3.add(6);
		set3.add(12);
		set3.add(8);
		set3.add(1);
		set3.add(16);
		set3.add(15);
		
		// set 5
		set5.add(15);
		set5.add(4);
		set5.add(0);
		set5.add(-4);
		
		
		//set 6
		set6.add(2);
		set6.add(6);
		set6.add(11);
		
		//set 7
		set7.add(2);
		set7.add(5);
		set7.add(4);
		
		
	}

	
	/**
	 * clear unit test
	 */

	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		set1.clear();
		int length = set1.length();
		assertEquals(0, length);
	}
	
	
	
	
	/**
	 * unit test for length
	 */
	
	@Test
	@DisplayName("test case for lenth")
	public void testLenth() {
		set2.add(12);
		set2.add(8);
		set2.add(6);
		set2.add(15);
		set2.add(16);
		set2.add(1);
		
		int length = set2.length();
		assertEquals(6, length);
	}
	
	
	/*
	 * unit test for equals
	 */
	@Test
	@DisplayName("test case for equals")
	public void testEquals() {
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		set2.add(12);
		set2.add(8);
		set2.add(6);
		set2.add(15);
		set2.add(16);
		set2.add(1);
		
		set3.add(6);
		set3.add(12);
		set3.add(8);
		set3.add(1);
		set3.add(16);
		set3.add(15);
		
		boolean value = set1.equals(set2);
		assertEquals(false, value);
		
		boolean value2 = set2.equals(set3);
		assertEquals(true, value2);
	}
	
	
	/*
	 * unit test for a value in the set 
	 */
	@Test
	@DisplayName("test case if a value is in the set")
	public void testContains() {
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		boolean value = set1.contains(4);
		assertEquals(true, value);
		
		boolean value2 = set1.contains(0);
		assertEquals(false, value2);
		
	}
	
	
	
	/**
	 * unit test case for largest
	 * @throws IntegerSetException if set is empty
	 */
	@Test
	@DisplayName("test case to return the largest value, exception if empty")
	public void testLargest() throws IntegerSetException {
		set2.add(12);
		set2.add(8);
		set2.add(6);
		set2.add(15);
		set2.add(16);
		set2.add(1);
		
		int ans = 16;
		Exception exception = assertThrows(IntegerSetException.class, () -> {
			int test = set2.largest();
		});
		
		assertEquals(ans, test);
		
	}
		
		
	/**
	 * unit test case for smallest
	 * @throws IntegerSetException if set is empty
	 */
	@Test
	@DisplayName("test for smallest")
	public void testSmallest() throws IntegerSetException {
		set5.add(15);
		set5.add(4);
		set5.add(0);
		set5.add(-4);
		
		int ans = -4;
		Exception exception = assertThrows(IntegerSetException.class, () -> {
			int test = set5.smallest();
		});
		
		assertEquals(ans, test);
	}
	
	
	
	/**
	 * unit testing for adding an item
	 */
	
	@Test
	@DisplayName("test for adding an item")
	public void testAdd() {
		set5.add(15);
		set5.add(4);
		set5.add(0);
		set5.add(-4);
		int item = 5;
		set5.add(item);
		
		boolean value = set5.contains(item);
		assertEquals(true, value);

	}

	
	
	
	/**
	 * unit test for removing an item
	 */
	@Test
	@DisplayName("test for removing an item")
	
	public void testRemove() {
		set2.add(12);
		set2.add(8);
		set2.add(6);
		set2.add(15);
		set2.add(16);
		set2.add(1);
	
		int item = 1;
		set2.remove(item);
		
		boolean value = set2.contains(item);
		assertEquals(false, value);	
	}
	
	
	
	/**
	 * unit test for union of sets
	 */
	@Test
	@DisplayName("test for union of two sets")
	public void testUnion() {
		set5.add(15);
		set5.add(4);
		set5.add(0);
		set5.add(-4);
		
		set6.add(2);
		set6.add(6);
		set6.add(11);
		set5.union(set6);
		assertEquals(set5.toString(), "15 4 0 -4 2 6 11");
	}
	
	
	
	/**
	 * unit test for intersection of sets
	 */
	@Test
	@DisplayName("test intersection")
	public void testIntersection() {
		set6.add(2);
		set6.add(6);
		set6.add(11);
		set7.add(2);
		set7.add(5);
		set7.add(4);
		
		set6.intersect(set7);
		String ans = "2";
		assertEquals(ans, set6.toString());
			
	}
	
	
	/**
	 * unit test for difference of sets
	 */
	
	@Test
	@DisplayName("test case for difference")
	public void testDifference() {
		set7.add(2);
		set7.add(5);
		set7.add(4);
		
		set6.add(2);
		set6.add(6);
		set6.add(11);
		
		set6.diff(set7);
		String ans = "6 7 5 4";
		assertEquals(ans, set6.toString());
			
	}
	
	
	
	/**
	 * unit test for an empty set
	 */
	@Test
	@DisplayName("test case for empty")
	public void testIsEmpty() {
		
		set2.add(12);
		set2.add(8);
		set2.add(6);
		set2.add(15);
		set2.add(16);
		set2.add(1);
		
		boolean test = set4.isEmpty();
		boolean test2 = set2.isEmpty();
				
		assertEquals(true, test);
		assertEquals(false, test2);
			
	}
	
	/**
	 * test case for to string
	 */
	@Test
	@DisplayName("test case for to string")
	public void testtoString() {
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		String test = set1.toString();
		
		assertEquals("1 2 3 4 5", test);
		
			
	}
	
	

	
}
