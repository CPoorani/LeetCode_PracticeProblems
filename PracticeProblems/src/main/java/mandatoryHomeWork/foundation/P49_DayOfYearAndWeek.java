package mandatoryHomeWork.foundation;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class P49_DayOfYearAndWeek {
	
	/*
	 * 2019-01-09 ==> Jan (01), directly return 9 
	 * 2019-02-10 ==> 2019 is not a leap year ==> 31+10 == 41 
	 * 2004-05-01 ==> 2004 is a leap year ==> 31+29+1 ==> 61
	 * 
	 * Input : String
	 * Output : Int
	 * Split the string into three as integer (year, month and day using substring)
	 * Create an array with the days that each month hold (monthDays)
	 * Iterate through the given month 
	 * 	day = day (input) + monthDats[i-1] (as i starts from 1 - Jan)
	 * 	if i==2 (feb) and if the year is leap year
	 * 		add a extra day (day++)
	 * Return day
	 */

	@Test
	public void test() {
		Assert.assertEquals(61, findDate("2004-03-01"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(9, findDate("2019-01-09"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(41, findDate("2019-02-10"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals("Saturday", dayOfTheWeek(31, 8, 2019));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals("Wednesday", dayOfTheWeek(05, 9, 1990));
	}
	
	
	public String dayOfTheWeek(int day, int month, int year) {
		String[] week = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int count = 0;
		for (int i = 1971; i < year; i++) {
			if (isLeapYear(i)) {
				count = count + 366;
			} else {
				count = count + 365;
			}
		}
		for (int i = 0; i < month - 1; i++) {
			count += monthDays[i];
		}
		count += day;
		return week[(count + 4) % 7];
	}

	public int findDate(String date) {
		int year = Integer.valueOf(date.substring(0, 4));
		int month = Integer.valueOf(date.substring(5, 7));
		int day = Integer.valueOf(date.substring(8, 10));
		int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 1; i < month; i++) {
			day = day + monthDays[i - 1];
			if (i == 2 && isLeapYear(year)) {
				day++;
			}

		}
		return day;

	}

	private boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

}