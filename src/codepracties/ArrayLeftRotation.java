package codepracties;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayLeftRotation {

	public static int[] arrayLeftRotation(int[] a, int n, int k) {
		while (k != 0) {

			int temp = a[0];
			for (int j = 0; j < n-1; j++) {

				a[j] = a[j + 1];
			}
			a[n-1] = temp;

			k--;
		}

		return a;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		int[] output = new int[n];
		output = arrayLeftRotation(a, n, k);
		for (int i = 0; i < n; i++)
			System.out.print(output[i] + " ");

		System.out.println();

	}
}
