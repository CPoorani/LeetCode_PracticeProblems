package dailyPrograms;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class P101_BaseballGame {
	
	/*
	 * Iterate through the input operations
	 * If the string equals 'C', pop the value
	 * If the string equals 'D', 2 multiplied with the top element
	 * If the string equals '+', n1 should be as the stack.pop (removing the top element) and n2 will be the peek
	 * 	Add n1 and n2 and push it to stack and retain the n1
	 * If it is a integer, then push as it is
	 * Iterate through the stack and find the sum of all the scores
	 * return sum
	 */

	public int calPoints(String[] operations) {
		int sum = 0;
		Stack<Integer> stack = new Stack<>();

		for (String op : operations) {
			if (op.equals("+")) {
				int n1 = stack.pop();
				int n2 = stack.peek();
				int n3 = n1 + n2;
				stack.push(n1);
				stack.push(n3);
			} else if (op.equals("C")) {
				stack.pop();
			} else if (op.equals("D")) {
				stack.push(2 * stack.peek());
			} else {
				int score = Integer.parseInt(op);
				stack.push(score);
			}
		}

		for (int scores : stack) {
			sum += scores;
		}

		return sum;
	}

	@Test
	public void test() {
		Assert.assertEquals(30, calPoints(new String[] { "5", "2", "C", "D", "+" }));
	}

	@Test
	public void test1() {
		Assert.assertEquals(27, calPoints(new String[] { "5", "-2", "4", "C", "D", "9", "+", "+" }));
	}
}