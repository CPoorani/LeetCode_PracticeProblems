package dailyConnect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.Assert;

public class FindDuplicateInArray {
	
	/*
	 * Input  : n (No. of elements) and ArrayList 
	 * Inner and outer loop to compare the elements
	 * Initialize a variable duplicate
	 * if the element appears twice, assign the element to duplicate and return
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println("Elements:");
		for (int i = 0; i < n; i++) {
			int element = scanner.nextInt();
			arr.add(element);
		}

		int duplicate = findDuplicate(arr, n);
		System.out.println("Duplicate: " + duplicate);

		scanner.close();
	}

	public static int findDuplicate(ArrayList<Integer> arr, int n) {
		int duplicate = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr.get(i).equals(arr.get(j))) {
					duplicate = arr.get(i);
					break;
				}
			}
		}
		return duplicate;
	}
}