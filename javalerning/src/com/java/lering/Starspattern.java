package com.java.lering;

public class Starspattern {

	public static void main(String[] args) {
		
		
		
		for (int i = 1; i <=3; i++)
		{
			for (int k = 3-1; k >=i; k--)
			{
				System.out.println();
				
			}
			for (int j = 1; j <=i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <=3; i++)
		{
			for (int k = 1; k <=i; k++) 
			{
				System.out.println();
			}
			for (int j = 2; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		

	}

}

