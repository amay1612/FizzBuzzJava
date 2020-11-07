package com.fizzbuzz.test;

import org.junit.Assert;
import org.junit.Test;

import com.fizzbuzz.FizzBuzzConverter;

public class FizzBuzzTest {
	
	@Test
    public void fizzBuzzConvertorLeavesNormalNumbersAlone(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("1", fizzBuzz.convert(1));
        Assert.assertEquals("2", fizzBuzz.convert(2));

      }
	
	@Test
    public void fizzBuzzConvertorMultiplesOfThree(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Fizz", fizzBuzz.convert(3));

    }
	
	 @Test
	    public void fizzBuzzConvertorMultiplesOfFive(){

	        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

	        Assert.assertEquals("Buzz", fizzBuzz.convert(5));

	    }
}
