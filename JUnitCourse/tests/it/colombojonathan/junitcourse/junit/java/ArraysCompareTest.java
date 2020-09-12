package it.colombojonathan.junitcourse.junit.java;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	//Arrays.sort
	
	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = {12,3,4,1};
		int[] expected = {1,3,4,12};
		Arrays.sort(numbers);
		//assertEquals è per oggetti
		//per Array di interi assertArrayEquals
		assertArrayEquals(expected, numbers);
	}
	
	@Test (expected=NullPointerException.class)
	public void testArrayNull_RandomArray() {
		int[] numbers = null;
		try {
		Arrays.sort(numbers);
		}catch(NullPointerException e) {
			throw new NullPointerException();
		}
	}
	
	@Test(timeout=1000)
	public void testSort_Performance() {
		int[] array = {12,23,4};
		for(int i=1;i<=1000000;i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}
	

}
