package dailyConnect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class CompareTriplets {
	/*
	 * Input : List
	 * Output : List
	 * Traverse through the size of list (a)
	 * 	Get each of the element
	 * 		if a>b, increase alice score by 1
	 * 		if b>a, increase bob score by 1
	 * Create an empty list
	 * Add alice score and bob score
	 * return the list
	 */
	@Test
	public void test()
	{
		List<Integer> a = Arrays.asList(5, 6, 7);
		List<Integer> b = Arrays.asList(3, 6, 10);
		List<Integer> result = Arrays.asList(1, 1);
		Assert.assertEquals(result, compareTriplets(a, b));
	}

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		int aScore = 0;
		int bScore = 0;

		for (int i = 0; i < a.size(); i++) {
			int alice = a.get(i);
			int bob = b.get(i);

			if (alice > bob) {
				aScore++;
			} else if (alice < bob) {
				bScore++;
			}
		}

		List<Integer> result = new ArrayList<>();
		result.add(aScore);
		result.add(bScore);

		return result;
	}
}
