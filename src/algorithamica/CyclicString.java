package algorithamica;

public class CyclicString {
	public static void main(String[] args) {

		boolean iscyclic = isCyclic2("ABCD", "CDAB");
		System.out.println(iscyclic);
	}

	private static boolean isCyclic(String string, String string2) {
		if (!string.equalsIgnoreCase(string2)) {
			String str = string + string;
			return str.indexOf(string2) != -1;

		}
		return false;
	}

	private static boolean isCyclic2(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		for (int i = 0; i < s1.length(); i++)
			if ((s1.substring(i) + s1.substring(0, i)).equals(s2))
				return true;
		return false;
	}
}
