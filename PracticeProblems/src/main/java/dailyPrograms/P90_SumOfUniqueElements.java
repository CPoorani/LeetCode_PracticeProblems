package dailyPrograms;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class P90_SumOfUniqueElements {
	/*
	 * Initialize a variable sum
	 * Create a hash map, iterate through the input array
	 * If the map has the key, then get the value and increment by 1 else add it to the map
	 * Iterate through the map 
	 * Get the key that has the value as 1 and add it to sum
	 * Return sum
	 */
	@Test
	public void test()
	{
		Assert.assertEquals(15, sumOfUnique(new int[] {1,2,3,4,5}));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(0, sumOfUnique(new int[] {1,1,1,1}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(10, sumOfUnique(new int[] {10}));
	}
	
	public int sumOfUnique(int[] nums) {
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int n : nums) {
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
			} else {
				map.put(n, 1);
			}
		}
		for (Map.Entry<Integer, Integer> ele : map.entrySet()) {
			if (ele.getValue() == 1) {
				sum = sum + ele.getKey();
			}
		}
		return sum;

	}
}
