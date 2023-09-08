package dailyConnect;

import org.junit.Test;
import org.testng.Assert;

public class BeautifulString {
	
	/*
	 * Input : String
	 * Output : Int
	 * If the i and i-1 is not equal 
	 * 	Change the value to 0 or 1 accordingly
	 * 	Increase the count
	 * Return the count
	 * Input Output
	 * 2		
	   0000	 2
       1010  0
       
	 */
	@Test
	public void test()
	{
		Assert.assertEquals(5, makeBeautiful("01010010101")); 
	}

	public static int makeBeautiful(String str) {
		
		char[] arr = str.toCharArray();
		int count = 0;
		
			for (int i = 1; i < arr.length; i++) {
		        if (arr[i] == arr[i - 1]) {
		            if (arr[i] == '0') {
		                arr[i] = '1';
		            } else {
		                arr[i] = '0';
		            }
		            count++;
		        }
		}
			return count;

    }
}
	
	