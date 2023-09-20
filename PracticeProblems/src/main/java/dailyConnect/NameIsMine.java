package dailyConnect;

import org.junit.Test;
import org.testng.Assert;

public class NameIsMine {

	/*
	 * https://www.codechef.com/problems/NAME2
	 * Input : String
	 * Output : String
	 * if a and b, both are equal then return no
	 * Create a string builder for the string b
	 * convert the string to char array
	 * find the index for the character 
	 * if the index is found, then delete the character from str
	 * after iterating the entire a, return yes if the index is not -1 
	 * 
	 * Iterate till the length of a and length of b
	 * check for the characters at a and b
	 * increase i if equal 
	 * increase j for every iteration
	 * 
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals("YES", findsubsequence("john", "johanna"));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals("NO", findsubsequence("test", "test"));
	}
	
	public String findsubsequence(String a, String b) {
		if (a.equals(b)) {
	        return "NO"; 
	    }

	    StringBuilder str = new StringBuilder(b);

	    for (char c : a.toCharArray()) {
	        int index = str.indexOf(String.valueOf(c));
	        if (index == -1) {
	            return "NO";
	        }
	        str.delete(0, index + 1);
	    }

	    return "YES";
	}
	
	public String usingTwoPointer(String s, String t)
	{
		int i = 0, j=0;
		
		for(;i<s.length() && j<t.length();)
		{
			if(s.charAt(i) == t.charAt(i))
			{
				i++;
			}
			j++;
		}
        return t.substring(j).contains(s.substring(i)) ? "YES" : "NO";
	}
}