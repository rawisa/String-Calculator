package com.rawi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
	public int add(String number){
		if(number.isEmpty()){
			return 0;
		}else if(number.contains(",")||number.contains("//")||number.contains("\n")){
			int sum = sumNumberWithDelimeter(number);
			return sum;
		}
		else{
			return toInteger(number);
		}
	}

	private int sumNumberWithDelimeter(String number) {
		String[] numbers;
		if(number.startsWith("//")){
			Matcher m = Pattern.compile("//(.)\n(.*)").matcher(number);
			m.matches();
			String delimeter = m.group(1);
			String number1 = m.group(2);
			numbers = number1.split(Pattern.quote(delimeter));
		}else{
			numbers = number.split(",|\n");
		}
		int sum=0;
		for(int i=0;i<numbers.length;i++)
			sum+=toInteger(numbers[i]);
		return sum;
	}

	private int toInteger(String number) {
		return Integer.parseInt(number);
	}
}
