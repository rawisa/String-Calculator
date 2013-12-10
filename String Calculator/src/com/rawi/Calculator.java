package com.rawi;

public class Calculator {
	public int add(String number){
		if(number.isEmpty())
			return 0;
		else{
			return Integer.parseInt(number);
		}
	}
}
