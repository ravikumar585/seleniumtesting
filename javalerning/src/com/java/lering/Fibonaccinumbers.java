package com.java.lering;

public class Fibonaccinumbers {

	public static void main(String[] args) {
		
		int n=10;
		
		int f1=0,f2=1;
		//System.out.println(f1);
	//	System.out.println(f2);
		
		int f=f1+f2;
		System.out.println(f);
		int count=3;
		while(count<n)
		{
			 f1=f2;
			 f2=f;
			 f=f1+f2;
			 System.out.println(f);
			 count++;
		}
	}

}
