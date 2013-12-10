package com.rawi;

public class Calculator {
	public int add(String number){
		if(number.isEmpty()){
			return 0;
		}else if(number.contains(",")){
			int sum = sumNumberWithComma(number);
			return sum;
		}
		else{
			return toInteger(number);
		}
	}

	private int sumNumberWithComma(String number) {
		String[] numbers = number.split(",|\n");
		int sum=0;
		for(int i=0;i<numbers.length;i++)
			sum+=toInteger(numbers[i]);
		return sum;
	}

	private int toInteger(String number) {
		return Integer.parseInt(number);
	}
}
