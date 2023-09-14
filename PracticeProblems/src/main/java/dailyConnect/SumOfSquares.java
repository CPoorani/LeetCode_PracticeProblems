package dailyConnect;

public class SumOfSquares {
	/*
	 * Input : Array
	 * Output : int
	 * 
	 */
	
	public int sumOfSquares(int[] nums) {
		int result = 0;
		int n = nums.length;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result = result + nums[i - 1] * nums[i - 1];
            }
        }

        return result;
        
    }


}
