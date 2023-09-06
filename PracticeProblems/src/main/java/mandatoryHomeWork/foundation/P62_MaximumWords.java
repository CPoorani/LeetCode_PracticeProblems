package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P62_MaximumWords {
	
	/*
	 * Input : Array
	 * Output : Int
	 * Initialize a variable maxCount to 0
	 * Traverse through the given array
	 * 	Split based on space and store it in an array
	 * 	Get the count and compare with maxcount
	 * If the count > MaxCount, assign the count to maxCount
	 * Return maxCount
	 */
	
	@Test
	public void test()
	{
		String[] actual = new String[] {"alice and bob love leetcode", "i think so too too", "this is great thanks very much"};
		Assert.assertEquals(6, mostWordsFound(actual));
	}
	
	@Test
	public void test1()
	{
		String[] actual = new String[] {"alice and bob love leetcode"};
		Assert.assertEquals(5, mostWordsFound(actual));
	}
	 public int mostWordsFound(String[] sentences) {
		 
		int maxCount = 0;
		 
		 
		for(int i=0; i<sentences.length; i++)
		{
			String[] words = sentences[i].split(" ");
			int count = words.length;
			
			if(count > maxCount)
			{
				maxCount = count;
			}
		}
		return maxCount;
	 
}
}
