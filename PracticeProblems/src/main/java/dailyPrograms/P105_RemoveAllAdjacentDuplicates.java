package dailyPrograms;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class P105_RemoveAllAdjacentDuplicates {
	
	/*
	 * Iterate through the length of the array
	 * If the top element and the char at the index equals, then pop it from the stack else push it to stack
	 * Using string builder
	 * Iterate through the stack and append each character
	 * Return the result as String object
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals("ay", removeDuplicates("azxxzy"));
	}
	@Test
	public void test1()
	{
		Assert.assertEquals("c", removeDuplicates("abbacabbbbcccca"));
	}

	 public String removeDuplicates(String s) { //abbaca
	       Stack<Character> stack = new Stack<>();
	       for(int i=0; i<s.length(); i++)
	       {
	    	   if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
	               stack.pop(); 
	           } else {
	               stack.push(s.charAt(i)); 
	           }
	       }
	       
	       StringBuilder result = new StringBuilder();
	       for (char ch : stack) {
	           result.append(ch); 
	       }
	       return result.toString();
	       
	 }
}