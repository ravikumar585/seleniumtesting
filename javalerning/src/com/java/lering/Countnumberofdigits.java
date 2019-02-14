package com.java.lering;

public class Countnumberofdigits {

	public static void main(String[] args) {

		
		int n=8769,count=0;
		while(n>0)
		{
			n=n/10;
			count=count+1;
			
			
		}
		System.out.println(count);
		

	}

}
