package dailyConnect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class FizzBuzz {
	
	/*
	 * Create an empty list 
	 * If a number is divisible by 15, add it as "FizzBuzz" to the list
	 * If a number is divisible by 3, add it as "Fizz" to the list
	 * If a number is divisible by 5, add it as "Buzz" to the list
	 * If none of the above condition satisfies, add the number to the list
	 * return result
	 */
	
	@Test
	public void test() {
		List<String> expected = Arrays.asList("1", "2", "Fizz");
		Assert.assertEquals(expected, fizzBuzz(3));
	}

	public List<String> fizzBuzz(int n) {
		List<String> result = new ArrayList<>();
		for (int i = 1; i <= n; i++) { // Start from 1, not 0
			if (i % 15 == 0) {
				result.add("FizzBuzz");
			} else if (i % 3 == 0) {
				result.add("Fizz");
			} else if (i % 5 == 0) {
				result.add("Buzz");
			} else {
				result.add(Integer.toString(i));
			}
		}
		return result;
	}

}
