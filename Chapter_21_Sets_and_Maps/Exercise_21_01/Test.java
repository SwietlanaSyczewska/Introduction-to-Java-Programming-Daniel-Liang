package Exercise_21_01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test {

	public static void main(String[] args) {
		LinkedHashSet<String> set1 = new LinkedHashSet<String>(
				Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
		System.out.println("Set1 " + set1);
		LinkedHashSet<String> set2 = new LinkedHashSet<String>(
				Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
		System.out.println("Set2 " + set2);
		LinkedHashSet<String> setUnion = (LinkedHashSet<String>) set1.clone();
		setUnion.addAll(set2);
		System.out.println("Union " + setUnion);
		LinkedHashSet<String> setDifference = (LinkedHashSet<String>) set1.clone();
		setDifference.removeAll(set2);
		System.out.println("Difference " + setDifference);
		LinkedHashSet<String> setIntersection = (LinkedHashSet<String>) set1.clone();
		setIntersection.retainAll(set2);
		System.out.println("Intersection " + setIntersection);

	}

}
