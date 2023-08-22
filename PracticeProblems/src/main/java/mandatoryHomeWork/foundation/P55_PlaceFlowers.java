package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class P55_PlaceFlowers {
	
	/*
	 * https://leetcode.com/problems/can-place-flowers/description/
	 * 1 0 0 0 1 -- n=1 => 1 0 1 0 1
	 * 1 0 0 0 1 -- n=2 => Cannot place two flowers => false
	 * 0 0 1 0-- n=1 => 1 0 1 0
	 * 1 0 0 0 -- n=1 => 1 0 1 0 
	 * 1 0 0 0 0 1 -- n=2 => 1 0 1 0 0 1 (false)
	 * 
	 * Input : Array and Int
	 * Output : Boolean
	 * Have a flag variable and initialize it to false
	 * Iterate through the given input array
	 * 	If the position of i, has 0, then proceed with further steps
	 * 		check if adjacent position has 1 
	 * 		a) To check i-1 == 1
	 * 		b) to check i+1 == 1
	 * If the above conditions return true
	 * Decrease the n value
	 * if n<=0, then return true else false
	 */
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, flowersPosition(2, new int[] {1,0,0,0,1,0,0}));
	}
	
	public void test2()
	{
		Assert.assertEquals(false, flowersPosition(1, new int[] {0,1,1}));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(true, flowersPosition(1, new int[] {1,0,0,0,1}));
	}
	
	
	
	public boolean flowersPosition(int n, int[] flowerbed)
	{
		    for (int i = 0; i < flowerbed.length; i++) {
		    	
		        if (flowerbed[i] == 0) {
		            boolean flag = true;
		            
		            if (i > 0 && flowerbed[i - 1] == 1) {
		                flag = false;
		            }
		            
		            if (i < flowerbed.length - 1 && flowerbed[i + 1] == 1) {
		                flag = false;
		            }
		            
		            if (flag) {
		                flowerbed[i] = 1;  
		                n--;
		                
		            }
		            if(n==0)
		            {
		            	break;
		            }
		        }
		    }
		    
		    return n <= 0;
		}
	
}

