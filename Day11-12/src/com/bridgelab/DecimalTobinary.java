package com.bridgelab;

public class DecimalTobinary {
	public static void main(String args[])
	{   
		//Decimal Number
		int decimal = 10;
		//integer array for storing binary digits 
		int binary[] = new int[20];
		int i = 0; 
		//writing logic for the conversion 
		while(decimal > 0)
		{       
			int riminder = decimal % 2;
			binary[i++] = riminder;
			decimal = decimal/2;
		}
		//printing result
		System.out.print("Binary number : ");
		for(int j = i-1 ; j >= 0 ; j--)
		System.out.print(binary[j]+"");
	}

}
