package algorithamica;

public class StringCombination {

	public static void main(String[] args) {
		StringCombination s = new StringCombination();
		s.printAll("ABCD");
	}

	public void printAll(String input) {
		if (input == null || input.length() <= 1) {
			// since we insert space in-between chars, so
			return;
		}
		int len = input.length();
		// len >= 2
		helper(input, len - 1);
	}

	private void helper(String s, int p) {
		if (p == 1) {
			System.out.println(s);
			// no insertion
			System.out.println(s.substring(0, 1) + " " + s.substring(1));
			// insert at position 1
		} else {
			helper(s, p - 1);
			helper(s.substring(0, p) + " " + s.substring(p), p - 1);
		}
	}

}
