package com.java.lering;

public class Addtwonumbers 

{
	int res=0;
	Addtwonumbers(int x,int y)
	{
	 res=x+y;
	}
}
class Add
{
public static void main(String[] arg)
{
	int a=10,b=20;
	
	
	Addtwonumbers c=new  Addtwonumbers(a,b);
	System.out.println("Addition of two numbers is : "+c.res);
}


}
