package dailyConnect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class CommonElements {

	/*
	 * https://www.codechef.com/INTPREP_01/problems/PREP17?tab=statement
	 * 
	 * Input : Array 
	 * Output : Int 
	 * Outer loop from i to array length 
	 * 	Inner loop from i+1 to array length 
	 * 	If the value of i and j matches, increase the counter value 
	 * Return counter
	 */

	@Test
	public void test() {
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = {1, 3, 4, 5};
		Assert.assertEquals(3, maxCommonElements(arr1, arr2));
	}
	
	@Test
	public void test1() {
		int[] arr1 = {4, 5, 9, 8, 2, 3, 17};
		int[] arr2 = {2, 3, 5, 10, 11, 4, 17};
		Assert.assertEquals(5, usingTwoPinter2(arr1, arr2));
	}

	public int maxCommonElements(int[] arr1, int[] arr2) {
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					count++;
				}
			}
		}
		return count;
	}
	
	/*
	 * Create two pointers, pointer1 = 0, pointer2 = 0
	 * Create an empty set and add the elements of arr1
	 * If the set contains the elements from arr2, then increment the pointer 2
	 * if arr1[pointer1] < arr2[pointer2], then increment pointer1 else increment pointer 2
	 */
	public int usingTwoPinter2(int[] arr1, int[] arr2)
	{
		    int count = 0;
	        int pointer1 = 0;
	        int pointer2 = 0;

	        Set<Integer> set = new HashSet<>();

	        for (int num : arr1) {
	            set.add(num);
	        }

	        while (pointer1 < arr1.length && pointer2 < arr2.length) {
	            if (set.contains(arr2[pointer2])) {
	                count++;
	                pointer2++;
	            } else if (arr1[pointer1] < arr2[pointer2]) {
	                pointer1++;
	            } else {
	                pointer2++;
	            }
	        }

	        return count;
	    }
	}
	
	
