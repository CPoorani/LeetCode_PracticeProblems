package dailyConnect;

public class OddIndexMatrix {
	
	/*
	 * mat [0] [0] 
	 * mat [0] [1]
	 * mat [1] [1] -- i%2 !=0 -- reverse order
	 * mat [1] [0] -- i%2 !=0 -- reverse order 
	 */

	public static void main(String[] args) {
        int[][] mat = {{1, 2}, {5, 6}};
        int[] resultArray = printMatrix(mat, mat.length);
        for (int num : resultArray) {
            System.out.print(num); // 1265
        } 
    }
	
	static int[] printMatrix(int mat[][], int n) {
		 int[] k = new int[n * n]; //4
		    int index = 0;

		    for (int i = 0; i < n; i++) { 
		        if (i % 2 == 0) {
		            for (int j = 0; j < n; j++) {
		                k[index++] = mat[i][j];
		            }
		        } else {
		            for (int j = n - 1; j >= 0; j--) {
		                k[index++] = mat[i][j];
		            }
		        }
		    }

		    return k;
		}
}