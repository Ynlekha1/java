package com.java.TypeCasting;

public class CastingPrimitives {
	
	public static void main(String[] args) {
		
		
		System.out.println("UPCASTING");
		
		int value = 200;
		long value1 = value;
		System.out.println(value1);
		
		
		float number=29.5f;
		double number1=number;
		System.out.println(number1);
		
		
		byte data=50;
		short data1=data;
		System.out.println(data1);
		
		
		char letter='l';
		int letter1=letter;
		System.out.println(letter1);
		
		
		short num=31;
		int num1=num;
		System.out.println(num1);
		
		
		
		System.out.println("DOWNCASTING");
		
		int numb=9000;
		short numb1=(short)numb;
		System.out.println(numb1);
		
		
		double percent=89.59;
		int percent1 = (int)percent;
		System.out.println(percent1);
		
		
		float mark=  70.8f;
		int mark1= (int)mark;
		System.out.println(mark1);
		
		
		int numerical=97;
		char numerical1=(char)numerical;
		System.out.println(numerical1);

	}

}
