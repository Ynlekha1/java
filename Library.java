package com.java.interfaces;

public class Library implements IssuingBook , ReturnBook {

	@Override
	public void Return() 
	{
		System.out.println("Book returned to th library");
		
	}

	@Override
	public void IssueBook() 
	{
		System.out.println("Book issued to the user");
		
	}

}
