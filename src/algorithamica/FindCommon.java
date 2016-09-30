package algorithamica;

public class FindCommon {
	public static void main(String[] args) {
		int ar1[] = { 1, 5, 10, 20, 40, 80,100,101 };
		int ar2[] = { 6, 7, 20, 80, 100 ,201};
		int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
		pintCommon(ar1, ar2, ar3);
	}

	static void pintCommon(int[] ar1, int[] ar2, int[] ar3) {
		int n1, n2, n3;

		n1 = ar1.length;
		n2 = ar2.length;
		n3 = ar3.length;
		int i = 0, j = 0, k = 0;
		while (i < n1 && j < n2 && k < n3)
			if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
				System.out.println(ar1[i] + " " + i++ + " " + j++ + " " + k++);
			}

			else if (ar1[i] < ar2[j])
				i++;

			// y < z
			else if (ar2[j] < ar3[k])
				j++;

			// We reach here when x > y and z < y, i.e., z is smallest
			else
				k++;

	}
}
