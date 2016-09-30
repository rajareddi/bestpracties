package geeksforgeeks;

public class AltrPostiveNag {

	public static void main(String[] args) {

		int[] input = { 9, 4, -2, -1, 5, 0, -5, -3, 2 };
		for (int i = 0; i < input.length; i++) {
			if ((input[i] > 0 && input[i + 1] >0)) {
					if (input[i] < 0) {
						int tem = input[i];
						input[i + 1] = input[i];
						input[i] = tem;
					}

			}
		}
		for (int i : input) {
			System.out.println(i);
		}
	}
}
