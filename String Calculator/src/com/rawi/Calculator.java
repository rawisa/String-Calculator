package com.rawi;

public class Calculator {
	public int add(String number){
		if(number.isEmpty()){
			return 0;
		}else if(number.contains(",")){
			String[] numbers = number.split(",");
			return toInteger(numbers[0])+toInteger(numbers[1]);
		}
		else{
			return toInteger(number);
		}
	}

	private int toInteger(String number) {
		return Integer.parseInt(number);
	}
}
