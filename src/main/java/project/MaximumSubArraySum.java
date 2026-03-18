package project;

public class MaximumSubArraySum {

	private static int maxSubArraySum(int[] arr) {
		int currentSum = arr[0];
		int maxSum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			currentSum = Math.max(arr[i], currentSum + arr[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}

	public static void main(String args[]) {
		int[] input1 = { 4, -6, 3, 2 };
		System.out.println(maxSubArraySum(input1));
		int[] input2 = { 2, 3, -8, 7, -1, 2, 3 };
		System.out.println(maxSubArraySum(input2));
		int[] input3 = { -2, -4 };
		System.out.println(maxSubArraySum(input3));
		int[] input4 = { 5, 4, 1, 7, 8 };
		System.out.println(maxSubArraySum(input4));
	}
}
