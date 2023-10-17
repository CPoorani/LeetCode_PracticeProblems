package dailyConnect;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class Pangram {
	
	/*
	 * Using stack, convert the sentence to lower case
	 * If the character is between lower case a to z
	 * 	If it is not present in the stack then push it to stack
	 * check if the size equals 26
	 * If not return false, else true
	 */
	@Test
	public void test()
	{
		Assert.assertEquals(true, checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
	}
	@Test
	public void test1()
	{
		Assert.assertEquals(false, checkIfPangram("z"));
	}
	@Test
	public void test2()
	{
		Assert.assertEquals(false, checkIfPangram("leet"));
	}
	
	public boolean checkIfPangram(String sentence) {

		Stack<Character> stack = new Stack<>();
		sentence = sentence.toLowerCase();
		
		for (char each : sentence.toCharArray()) {
			if (each >= 'a' && each <= 'z') {
				if (!stack.contains(each)) {
					stack.push(each);
				}
			}
		}

		return stack.size() == 26;
	}
}