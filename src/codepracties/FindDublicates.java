package codepracties;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class FindDublicates {
	public static void main(String[] args) {

	}

	public int[] getDublicate(String[] names, int n) {
		HashMap<String, Integer> nameAndCount = new HashMap<>();
		for (String name : names) {
			Integer count = nameAndCount.get(name);
			if (count == null) {
				nameAndCount.put(name, 1);
			} else {
				nameAndCount.put(name, ++count);
			}
		} // Print duplicate elements from array in Java
		Set<Entry<String, Integer>> entrySet = nameAndCount.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("duplicate element '%s' and count '%d' :",
						entry.getKey(), entry.getValue());
			}
		}
		return null;

	}
}
