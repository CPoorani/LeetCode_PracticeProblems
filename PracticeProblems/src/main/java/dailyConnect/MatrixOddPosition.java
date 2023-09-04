package dailyConnect;

public class MatrixOddPosition {
	/*
	 * mat [0] [0] 
	 * mat [0] [1] 
	 * mat [1] [1] -- reverse
	 * mat [1] [0] -- reverse
	 * Inner loop to iterate the columns 
	 * Outer loop for rows -- if it %2 equals 0, print the elements as given else print it in reverse order
	 */

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] resultArray = printMatrix(mat, mat.length);
		for (int num : resultArray) {
			System.out.print(num); // 123654789
		}
	}

	static int[] printMatrix(int mat[][], int n) {
		int[] k = new int[n * n];
		int index = 0;

		for (int[] row : mat) { // rows
			if (index % 2 == 0) {
				for (int j = 0; j < n; j++) {
					k[index++] = row[j];
				}
			} else {
				for (int j = n - 1; j >= 0; j--) {
					k[index++] = row[j];
				}
			}
		}

		return k;
	}
}
