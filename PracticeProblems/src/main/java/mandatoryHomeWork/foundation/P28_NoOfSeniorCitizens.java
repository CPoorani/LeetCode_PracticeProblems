package mandatoryHomeWork.foundation;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class P28_NoOfSeniorCitizens {
	
	/*
	 * Input : String array
	 * Ouput : Count
	 * Traverse through each of the String
	 * Take the part of age using substring method and store it in a String temp
	 * Initialize a variable age and convert the string temp to int
	 * if the age>60, increase the counter variable
	 * else return 0
	 */

	// "7868190130M7522","5303914400F9211","9273338290F4010"

	@Test
	public void test() {
		int actual = countSeniorCitizens(new String[] { "7868190130M7522", "5303914400F9211", "9273338290F4010" });
		Assert.assertEquals(2, actual);
	}

	@Test
	public void test1() {
		int actual = countSeniorCitizens(new String[] { "1313579440F2036","2921522980M5644" });
		Assert.assertEquals(0, actual);
	}

	public int countSeniorCitizens(String[] details) {
		String temp = "";
		int count = 0;
		for (int i = 0; i < details.length; i++) {
			temp = details[i].substring(11, 13);
			int age = Integer.valueOf(temp);
			if (age > 60) {
				count++;
			}
		}
		return count;
	}
}
