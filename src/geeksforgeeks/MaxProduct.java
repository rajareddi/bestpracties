package geeksforgeeks;

import java.util.Arrays;

public class MaxProduct {
	public static void main(String[] args) {

		int[] input = new int[] { 1, 100, 42, 4, 23 };

		Arrays.sort(input);

		for (int i : input) {
			System.out.print(i + " ");
		}
		int k = input.length;
		System.out.println(input[k - 2] * input[k - 1]);
	}
}
