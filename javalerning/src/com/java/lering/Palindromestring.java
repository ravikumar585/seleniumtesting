package com.java.lering;

public class Palindromestring {

	public static void main(String[] args) {
		
		
		String st="ROTATOR", rev = "";
	      
	 
	      
	      
	 
	      int length = st.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + st.charAt(i);
	 
	      if (st.equals(rev))
	         System.out.println(st+" is a palindrome");
	      else
	         System.out.println(st+" is not a palindrome");
	 

	}

}
