package recursive;

public class RemoveDublicates {
	public static void main(String[] args) {
		System.out.println(removeDups("AAABCCBACCADDD"));
	}

	public static String removeDups(String s) {
		if (s.length() <= 1)
			return s;
		if (s.substring(1, 2).equals(s.substring(0, 1)))
			return removeDups(s.substring(1));
		else
			return s.substring(0, 1) + removeDups(s.substring(1));
	}

}
