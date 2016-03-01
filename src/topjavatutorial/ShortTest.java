package topjavatutorial;

import java.util.HashSet;

public class ShortTest {
	public static void main(String[] args) {
		HashSet<Short> s = new HashSet<>();
		System.out.println(s.size());
		for (short i = 0; i < 10; i++) {
			s.add(i);
			int j=i-1;
			System.out.println(s.remove(j));
		}
		System.out.println(s.toString());
		System.out.println(s.size());
	}
}
