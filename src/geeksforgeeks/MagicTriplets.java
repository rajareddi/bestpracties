package geeksforgeeks;

public class MagicTriplets {

	public static void main(String[] args) {
		int[] a = new int[] { 8, 2, 3, 4 };
		System.out.println(findMax(a));
	}

	static int findMax(int[] a) {
		int finalC = 0;
		for (int i = 0; i < a.length; i++) {
			int j = i;
			int count = 0;

			while (j < a.length && a[i] <= a[j]) {

				count++;
				j++;
			}

			if (finalC < count) {
				finalC = count;
			}

		}
		return finalC;

	}
}
