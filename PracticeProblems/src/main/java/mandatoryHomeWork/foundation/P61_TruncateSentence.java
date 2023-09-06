package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P61_TruncateSentence {
	
	/*
	 * Input : String, int
	 * Output : String
	 * StringBuilder 
	 * 	Split with spaces
	 * 	Traverse through the array till k and append each word along with space, return as string object
	 * String 
	 *  Initialize a result array
	 *  Split using spaces
	 *  Traverse through the array till k
	 *  Add the words along with result
	 *  return the result string
	 */
	
	@Test
	public void test()
	{
		Assert.assertEquals("Hello how are you", truncateSentence("Hello how are you Contestant", 4));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals("Hello", truncate("Hello", 1));
	}
	
	public String truncateSentence(String s, int k)
	{
		String[] split = s.split(" ");
		StringBuilder str = new StringBuilder();
		for(int i=0; i<k && i<split.length; i++)
		{
			str.append(split[i]);
			str.append(" ");
			
		}
		return str.toString().trim();
		
	}
	
	public String truncate(String s, int k) {
		String[] split = s.split(" ");
		String result = "";

		for (int i = 0; i < k; i++) {
			result += split[i] + " ";
		}
		return result.trim();

	}
}
