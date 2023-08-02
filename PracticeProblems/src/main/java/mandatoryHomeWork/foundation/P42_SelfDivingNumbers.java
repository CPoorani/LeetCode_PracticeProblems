package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

public class P42_SelfDivingNumbers {
	/*
	 * Input : Two integers
	 * Output : List
	 * First split the digits 
	 * Iterate through the digits
	 *   Get the remainder first
	 *   With the first remainder check it equals to any number, then return false 
	 * else
	 *   Divide the number by 10 and continue
	 * Create a separate method to check if divisible with two integers
	 *   Iterate from left to right
	 *   If true, add it to list
	 */
	
	public void test()
	{
		List<Integer> expected = Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,15,22);
		Assert.assertEquals(0, 0);
	}
	
	
	public List<Integer> isDivisible(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for (int num = left; num <= right; num++) {
            if (splitDigits(num)) {
                list.add(num);
            }
        }
        return list;
    }

    private boolean splitDigits(int num) {
        int originalNum = num;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0 || originalNum % digit != 0) {
                return false;
            }
            num = num/10;
        }
        return true;
    }
}

