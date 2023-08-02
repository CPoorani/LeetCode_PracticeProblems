package mandatoryHomeWork.foundation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class P36_UniqueOccurences {
	/*
	 * Input: Array
	 * Output: Boolean
	 * Have an empty hashmap
	 * Traverse through the array and add the elements to map 
	 * If the value exist, then have the key as same and increase the value by 1
	 * Using set, add the values of map 
	 * return set.size() == map.size()
	 */
	@Test
	public void test() {
		Assert.assertEquals(true, uniqueElements(new int[] { 1, 2, 2, 1, 1, 3 }));
	}

	public boolean uniqueElements(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}

		}
		Set<Integer> set = new HashSet<Integer>(map.values());

		return set.size() == map.size();

	}

}
