package com.lambda;

public class LambdaExParameter {

	public static void main(String[] args) {
		
		StringFunction exclaim = (s) -> s + '!';
		StringFunction ask = (s) -> s + '?';
		
		printFormatted("Hello",exclaim);
		printFormatted("Hello",ask);

	}

	static void printFormatted(String string, StringFunction format) {
			String result = format.run(string);
			System.out.println(result);
	}

}
