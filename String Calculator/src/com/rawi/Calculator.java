package com.rawi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
	public int add(String number) throws Exception{
		if(number.isEmpty()){
			return 0;
		}else{
			int sum = sumNumberWithDelimeter(number);
			return sum;
		}
	}

	private int sumNumberWithDelimeter(String number) throws Exception {
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
		String minus="";
		for(int i=0;i<numbers.length;i++){
			if(toInteger(numbers[i])<0)
				//minus+=numbers[i]+" ";
				throw new Exception();
			sum+=toInteger(numbers[i]);
		}
		//if(minus.length()>0)
			//throw new Exception(minus);
		return sum;
	}

	private int toInteger(String number) {
		return Integer.parseInt(number);
	}
}
