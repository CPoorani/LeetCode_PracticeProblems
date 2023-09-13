package dailyConnect;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class BaseballGame {
	
	/*
	 * 
	 * Input: ops = ["5","2","C","D","+"]
		Output: 30
		Explanation:
		"5" - Add 5 to the record, record is now [5].
		"2" - Add 2 to the record, record is now [5, 2].
		"C" - Invalidate and remove the previous score, record is now [5].
		"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
		"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
		The total sum is 5 + 10 + 15 = 30.

	 * Input : String array, Output : int
	 * Convert the string to character array
	 * Create an arraylist to add all the operations
	 * Iterate through the list
	 * 	If C, remove the last element from the list
	 * 	If D, double the score and add it to list
	 * 	If number, add it as same to list
	 * Traverse through the list and add the scores
	 * Return sum
	 */
	
	@Test
	public void test()
	{
		String[] operations = {"5","2","C","D","+"};
		Assert.assertEquals(30, calPoints(operations));
	}
	
	@Test
	public void test1()
	{
		String[] operations = {"5","-2","4","C","D","9","+","+"};
		Assert.assertEquals(27, calPoints(operations));
	}
	
	public int calPoints(String[] op) {
		List<Integer> li = new ArrayList<>();
        
		int sum = 0;
		for (int i = 0; i < op.length; i++) {
			String operation = op[i];
			if (operation.equals("C")) {
				li.remove(i - 1);
			}

			else if (operation.equals("D")) {
				int lastElement = li.get(li.size() - 1);
				li.add(2 * lastElement);
			}

			else if (operation.equals("+")) {
				int n1 = li.get(li.size() - 1);
				int n2 = li.get(li.size() - 2);
				li.add(n1 + n2);
			} 
			
			else {
				 int number = Integer.parseInt(operation);
	             li.add(number);
			}

		}
		for (int scores : li) {
			sum = sum + scores;
		}
		return sum;

	}
}
