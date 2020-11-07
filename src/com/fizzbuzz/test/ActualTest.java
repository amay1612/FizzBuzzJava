package com.fizzbuzz.test;

import org.junit.Test;

import com.fizzbuzz.FizzBuzzConverter;

public class ActualTest {
	
	 @Test
	    public void outputTheHundredFizzBuzzes(){

	        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
	        for(int i=1; i<=100; i++){
	            System.out.println(fizzBuzz.convert(i));
	        }
	    }

}
