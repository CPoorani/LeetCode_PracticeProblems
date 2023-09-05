package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class P60_StringAcronym {
	
	/*
	 * Input : List and String
	 * Output : Boolean
	 * Traverse through the input string
	 * Using StringBuilder (output), append the first character of each word
	 * Convert the output to string object and compare with the input s
	 * If equal return true, else false
	 */
	
	@Test
	public void test()
	{
		List<String> li = new ArrayList<>(Arrays. asList("alice","bob","charlie"));
		String s = "abc";
		Assert.assertEquals(true, isAcronym(li, s));
	}
	
	@Test
	public void test1()
	{
		List<String> li = new ArrayList<>(Arrays. asList("never","gonna"));
		String s = "ca";
		Assert.assertEquals(false, isAcronym(li, s));
	}
	
	public boolean isAcronym(List<String> words, String s)
	{
		StringBuilder output = new StringBuilder();
		for (String str : words) {
			output.append(str.charAt(0));
		}
		
		if(output.toString().equals(s))
		{
			return true;
		}
		
		return false;
	}

}
