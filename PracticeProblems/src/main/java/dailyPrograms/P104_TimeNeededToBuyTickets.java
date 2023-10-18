package dailyPrograms;

import java.util.ArrayDeque;
import java.util.Queue;

import org.junit.Test;
import org.testng.Assert;

public class P104_TimeNeededToBuyTickets {
	
	/*
	 * Input : Array and int
	 * Output : int
	 * Create a object of queue, iterate through the the tickets length and add it to queue
	 * Initialize a counter variable
	 * If the queue is not empty
	 * 	For each of the index, check if the ticket is greater than 0
	 * 	If so, decrement the ticket value by 1 and increase the count by 1
	 * 	If the current is equal to k and when the value becomes 0, return the count
	 */
	@Test
	public void test()
	{
		Assert.assertEquals(8, timeRequiredToBuy(new int[] {5,1,1,1}, 0));
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2, timeRequiredToBuy(new int[] {1, 1}, 1));
	}

	public int timeRequiredToBuy(int[] tickets, int k) {

		Queue<Integer> queue = new ArrayDeque<>();
		for (int i = 0; i < tickets.length; i++) {
			queue.add(i);
		}

		int count = 0;
		while (!queue.isEmpty()) {
			int current = queue.poll();
			if (tickets[current] > 0) {
				tickets[current]--;
				count++;
				if (current == k && tickets[current] == 0) {
					return count;
				}
				queue.add(current);
			}

		}
		return count;
	}
}