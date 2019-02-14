package com.java.lering;

public class Stringresver {

	public static void main(String[] args) {
		
		
		String str="Ravi";

		System.out.println("Reverse of a String '"+str+"' is  :"); 
		int i=str.length();
		while(i>0)
		{
		System.out.print(str.charAt(i-1)); 
		i--;
		}
		
		
	}
	
}
