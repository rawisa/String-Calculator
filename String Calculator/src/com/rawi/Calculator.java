package com.rawi;

public class Calculator {
	public int add(String number){
		if(number.isEmpty()){
			return 0;
		}else if(number.contains(",")){
			String[] numbers = number.split(",");
			return Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
		}
		else{
			return Integer.parseInt(number);
		}
	}
}
