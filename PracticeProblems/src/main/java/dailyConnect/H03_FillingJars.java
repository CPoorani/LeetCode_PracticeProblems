package hackerrank;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class H03_FillingJars {

	/*
	 * https://www.hackerrank.com/challenges/filling-jars/problem?isFullScreen=true
	 */

	@Test
	public void test() {
	    List<List<Integer>> operations = new ArrayList<Object>();
	    operations.add(Arrays.asList(1, 2, 100));
	    operations.add(Arrays.asList(2, 5, 100));
	    operations.add(Arrays.asList(3, 4, 100));

	    int actual = findAverage(5, operations);
	    int expected = 160;

	    Assert.assertEquals(expected, actual);
	}

	public int findAverage(int n, List<List<Integer>> operations) {
	    long total = 0;

	    for (List<Integer> e : operations) {
	        int a = e.get(0) - 1;
	        int b = e.get(1) - 1;
	        int k = e.get(2);

	        total = total + (b - a + 1) * k;
	    }

	    int average = (int) (total / n);
	    return average;
	}
}