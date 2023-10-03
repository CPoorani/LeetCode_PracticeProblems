package dailyPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class P86_DestinationCity {
	
	/*
	 * Create an empty set
	 * Iterate through the paths and add the source cities in the set
	 * Again iterate through the paths and check the set if the source city is present
	 * If not, return the one that is not present as the destination city
	 */
	
	@Test
	public void test() {
		List<List<String>> li = new ArrayList<>();
		li.add(Arrays.asList("London", "New York"));
		li.add(Arrays.asList("New York", "Lima"));
		li.add(Arrays.asList("Lima", "Sao Paulo"));
		Assert.assertEquals("Sao Paulo", destCity(li));
	}

	@Test
	public void test1() {
		List<List<String>> li = new ArrayList<>();
		li.add(Arrays.asList("B", "Z"));
		Assert.assertEquals("Z", destCity(li));
	}

	@Test
	public void test2() {
		List<List<String>> li = new ArrayList<>();
		li.add(Arrays.asList("B", "C"));
		li.add(Arrays.asList("D", "B"));
		li.add(Arrays.asList("C", "A"));
		Assert.assertEquals("B", destCity(li));
	}

	public String destCity(List<List<String>> paths) {
		Set<String> set = new HashSet<String>();

		for (int i = 0; i < paths.size(); i++) {
			String source = paths.get(i).get(0);
			set.add(source);
		}

		for (int i = 0; i < paths.size(); i++) {
			String dest = paths.get(i).get(1);
			if (!(set.contains(dest))) {
				return dest;
			}
		}
		return null;
	}
}
