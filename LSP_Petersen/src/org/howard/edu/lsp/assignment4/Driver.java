package org.howard.edu.lsp.assignment4;

public class Driver {

		IntegerSet set1 = new IntegerSet();
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		System.out.println(�Value of Set1 is:� + set1.toString());
		System.out.println(�Smallest value in Set1 is:� + set1.smallest());
		System.out.println(�Largest value in Set1 is:� + set1.largest());

		IntegerSet set2 = new IntegerSet();
		set2.add(4);
		set2.add(5);

		System.out.println(�Union of Set1 and Set2�);
		System.out.println(�Value of Set1 is:� + set1.toString());
		System.out.println(�Value of Set2 is:� + set2.toString());
		set1.union(set2);	// union of set1 and set2
		System.out.println(�Result of union of Set1 and Set2�);
		set1.toString();	// result of union of set1 and set2

		
}
