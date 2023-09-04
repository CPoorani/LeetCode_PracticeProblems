package dailyConnect;

import java.util.ArrayList;
import java.util.List;

public class OddIndexMatrix {
	
	/*
	 * mat [0] [0] 
	 * mat [0] [1]
	 * mat [1] [1]  
	 * mat [1] [0] 
	 * Create an empty list
	 * Inner loop to iterate the columns
	 * Outer loop for rows -- if it %2 equals 0, print the elements as given
	 * else print it in reverse order
	 * Convert the list back to array and return
	 */

	public static void main(String[] args) {
		int[][] mat = { { 1, 2 }, { 5, 6 } };
		int[] resultArray = printMatrix(mat, mat.length);
		for (int num : resultArray) {
			System.out.print(num); // 1265
		}
	}

	static int[] printMatrix(int mat[][], int n) {
		List<Integer> k = new ArrayList<>();
		int index = 0;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					k.add(mat[i][j]);
				}
			} else {
				for (int j = n - 1; j >= 0; j--) {
					k.add(mat[i][j]);
				}
			}
		}

		int[] result = new int[k.size()];
		for (int i = 0; i < k.size(); i++) {
			result[i] = k.get(i);
		}

		return result;
	}
}
