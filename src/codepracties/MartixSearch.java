package codepracties;

public class MartixSearch {

	static Pair search(int[][] input, int search) {

		int r = 0;
		int c = input.length - 1;

		while (r < input.length && c >= 0) {

			if (input[r][c] == search) {
				return new Pair(r, c);
			} else if (search < input[r][c]) {
				--c;
			} else {
				++r;
			}
		}
		return new Pair(-1, -1);

	}

	public static void main(String[] args) {

		int[][] aa = { { 10, 20, 30 }, { 11, 21, 31 }, { 12, 22, 32 } };
		search(aa, 30).display();

	}
}

class Pair {
	int X;
	int Y;

	public Pair(int i, int j) {
		X = i;
		Y = j;
	}

	public void display() {
		System.out.println("X :" + X + "Y :" + Y);

	}

}
