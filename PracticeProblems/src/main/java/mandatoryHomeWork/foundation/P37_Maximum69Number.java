package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class P37_Maximum69Number {
	/*
	 * Input : Int
	 * Output : Int
	 * Have an empty arraylist
	 * Convert the input value to String
	 * String to char array and iterate through the input array and add it to list
	 * Iterate through the input array
	 * And if the index has the value '6' (Only for the first position)
	 * Change it to 9 and break
	 * Iterate through the list and convert back to int
	 */
	
	@Test
    public void test() {
        Assert.assertEquals(9969, maxNumber(9669));
    }
	
	@Test
    public void test1() {
        Assert.assertEquals(9999, maxNumber(9996));
    }
	
	@Test
    public void test2() {
        Assert.assertEquals(9999, maxNumber(9999));
    }

    public int maxNumber(int num) {
        List<Character> nums = new ArrayList<Character>();
        String str = String.valueOf(num);
        for (char ch : str.toCharArray()) {
            nums.add(ch);
        }

        for (char i : nums) {
            if (i == '6') {
                nums.set(nums.indexOf(i), '9'); // first conversion is enough to get the max
                break;
            }
        }

        int max = 0;
        for (char ch : nums) {
            max = max * 10 + (ch - '0');
        }
        return max;
    }
}

