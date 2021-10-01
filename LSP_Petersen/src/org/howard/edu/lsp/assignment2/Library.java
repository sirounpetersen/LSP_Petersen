package org.howard.edu.lsp.assignment2;

public class Library {
	// Add the missing implementation (methods and data definitions) to this class
	// Constructor – look it up
	
	String address;
	Book[] Bookarray;
	int Booknum;
	
	public Library(String title) {
	 // Implement the constructor
		address = title;
		Bookarray = new Book[50];
		Booknum = 0;
	}
	public static void main(String[] args) {
		// Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");
		// Add four books to the first library
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Prince"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));
		// Print opening hours and the addresses
		System.out.println("Library hours:");
		firstLibrary.printOpeningHours();
		System.out.println();
		
		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();
	
		
		// Try to borrow The Lords of the Rings from both libraries
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings");
		System.out.println();
		
		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();
		// Return The Lords of the Rings to the first library
		System.out.println("Returning The Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();
		
		
		firstLibrary.printAvailableBooks();
		System.out.println();
		//instructions say to repeat, not sure if iteas intended
		 }
	

	
	private void returnBook(String string) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < Booknum; i ++)
			if(Bookarray[i].getTitle().equals(string))
				if(Bookarray[i].isBorrowed()) {
					System.out.println("You successfully returned " + string);
					Bookarray[i].returned();
					return;
				}
				else {
					System.out.println("This book was not borrowed.");
					return;
				}
		System.out.println("Sorry, this book is not in our catalog.");
	}
	private void printAvailableBooks() {
		// TODO Auto-generated method stub
		if(Booknum == 0)
			System.out.println("No book in catalog.");
		for(int i = 0; i < Booknum; i ++)
			if(!Bookarray[i].isBorrowed())
				System.out.println(Bookarray[i].getTitle());
		
		
	}
	
	private void borrowBook(String string) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < Booknum; i++)
			if(Bookarray[i].getTitle().equals(string))
				if(Bookarray[i].isBorrowed())
			{
				System.out.println("Sorry, this book is already borrowed.");
				return;
			}
			else {
				System.out.println("You successfully borrowed " + string);
				Bookarray[i].borrowed();
				Bookarray[i].borrowed = true;
				return;
			}
		System.out.println("Sorry, this book is not in our catalog");
		
	}
	
	private void printAddress() {
		// TODO Auto-generated method stub
		System.out.println(address);
		
	}
	private void printOpeningHours() {
		// TODO Auto-generated method stub
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}
	private void addBook(Book book) {
		// TODO Auto-generated method stub
		Bookarray[Booknum] = book;
		Booknum ++;
	}
	} 

