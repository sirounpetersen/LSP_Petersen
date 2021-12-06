package org.howard.edu.lsp.assignment7;

public class Term {
	int coeff;
	int exponent; 
	
	//Default Constructor
	public Term(int c, int e) {
		coeff = c;
		exponent = e;
		
	}
	
	public int GetCoefficient() {
		return coeff;
	}
	
	public int GetExponent() {
		return exponent;
	}
	
	
	public String toString() {
	    String term;
	    String co;
	    String ex;

	    co = Integer.toString(coeff);
	    
	    if (coeff == 0){
	      term = "0";
	      return term;
	    }
	    
	    
	    if (exponent == 1) {
	      term = co + "x";
	      return term;
	    }

	    if (exponent == 0){
	      term = co;
	    }

	    else {
	      ex = Integer.toString(exponent);
	      term = co + "x^" + ex;
	    }
	    
	    return term;

		}
	
}



	
