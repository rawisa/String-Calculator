package com.rawi;

public class Calculator {
	public int add(String number){
		if(number.isEmpty()){
			return 0;
		}else if(number.contains(",")){
			String[] numbers = number.split(",");
			int sum=0;
			for(int i=0;i<numbers.length;i++)
				sum+=toInteger(numbers[i]);
			return sum;
		}
		else{
			return toInteger(number);
		}
	}

	private int toInteger(String number) {
		return Integer.parseInt(number);
	}
}
