package dailyPrograms;

import org.junit.Test;
import org.testng.Assert;

public class P81_MinimumRecolors {

	/*
	 * Input: blocks = "WBBWWBBWBW", k = 7
	 * Output: 3
	 * 
	 * Input: blocks = "WBWBBBW", k = 2
	 * Output: 0
	 * 
	 * Initialize a variable min to a max_value
	 * Loop through the blocks from the beginning to the length-k (Start will be 0 and end is length-k)
	 * Initialize a variable blackCount to 0
	 * Iterate from start to end
	 * 	for each of the iteration count the B count
	 * If blackCount is 0, set op to k
	 * else k minus the blackCount
	 * find the minimum between min and op
	 * return the min value
	 */
	@Test
	public void test()
	{
		Assert.assertEquals(3, minimumRecolors("WBBWWBBWBW", 7));
	}
	@Test
	public void test1()
	{
		Assert.assertEquals(100, minimumRecolors("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW", 100));
	}
	
	public int minimumRecolors(String blocks, int k) {
		 int min = Integer.MAX_VALUE;
		    
		    for (int start = 0; start <= blocks.length() - k; start++) {
		        int end = start + k;
		        int blackCount = 0;
		        
		        for (int i = start; i < end; i++) {
		            if (blocks.charAt(i) == 'B') {
		                blackCount++;
		            }
		        }
		        
		        int op = (blackCount == 0) ? k : k - blackCount;
		        
		        min = Math.min(min, op);
		    }
		    
		    return min;
		}
}