package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpression2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Rahul","Alok","Samanth");
		Collections.sort(names,(String a,String b) -> a.compareTo(b));
		
		names.forEach((n)->{
			System.out.println(n);
		});
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> evenNumbers = numbers.stream()
										   .filter(n -> n%2 == 0)
										   .collect(Collectors.toList());
		
		evenNumbers.forEach((n) -> {
			System.out.println(n);
		});

	}

}

