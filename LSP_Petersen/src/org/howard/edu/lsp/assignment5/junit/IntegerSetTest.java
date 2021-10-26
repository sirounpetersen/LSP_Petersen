package org.howard.edu.lsp.assignment5.junit;

import org.howard.edu.lsp.assignment5.integerset.IntegerSet;
import java.util.ArrayList;
import java.util.List;

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
	
	
	public void init() {
		//set 1 
		for (int i = 1; i < 6; i ++) {
			set1.add(i);
		}
		
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


	
	
	

	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		set1.clear();
		int length = set1.length();
		assertEquals(0, length);
	}
	
	
	@Test
	@DisplayName("test case for lenth")
	public void testLenth() {
		
		int length = set2.length();
		assertEquals(6, length);
	}
	
	
	
	@Test
	@DisplayName("test case for equals")
	public void testEquals() {
		boolean value = set1.equals(set2);
		assertEquals(false, value);
		
		boolean value2 = set2.equals(set3);
		assertEquals(true, value2);
	}
	
	
	@Test
	@DisplayName("test case if a value is in the set")
	public void testContains() {
		boolean value = set1.contains(4);
		assertEquals(true, value);
		
		boolean value2 = set1.contains(0);
		assertEquals(false, value2);
		
	}
	
	
	@Test
	@DisplayName("test case to return the largest value, exception if empty")
	public void testLargest() throws IntegerSetException {

		int ans = 16;
		Exception exception = assertThrows(IntegerSetException.class, () -> {
			int test = set2.largest();
		});
		
		assertEquals(ans, test);
		
	}
		
		
	@Test
	@DisplayName("test for smallest")
	public void testSmallest() throws IntegerSetException {
		
		int ans = -4;
		Exception exception = assertThrows(IntegerSetException.class, () -> {
			int test = set5.smallest();
		});
		
		assertEquals(ans, test);
	}
	
	
	
	@Test
	@DisplayName("test for adding an item")
	public void testAdd() {
		int item = 5;
		set5.add(item);
		
		boolean value = set5.contains(item);
		assertEquals(true, value);

	}

	
	@Test
	@DisplayName("test for removing an item")
	public void testRemove() {
		int item = 1;
		set2.remove(item);
		
		boolean value = set2.contains(item);
		assertEquals(false, value);
		
		
	}
	
	
	@Test
	@DisplayName("test for union of two sets")
	public void testUnion() {
		set5.union(set6);
		assertEquals(set5.toString(), "15 4 0 -4 2 6 11");
		
	}
	
	@Test
	@DisplayName("test intersection")
	public void testIntersection() {
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
