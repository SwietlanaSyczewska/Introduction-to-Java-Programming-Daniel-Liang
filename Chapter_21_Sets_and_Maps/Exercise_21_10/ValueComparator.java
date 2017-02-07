package Exercise_21_10;

import java.util.Comparator;
import java.util.HashMap;

public class ValueComparator implements Comparator<String> {
	HashMap<String, Integer> map = new HashMap<String, Integer>();

	public ValueComparator(HashMap<String, Integer> map) {
		this.map.putAll(map);
	}

	@Override
	public int compare(String string1, String string2) {
		if (map.get(string1) > map.get(string2)) {
			return -1;
		} else if (map.get(string1) < map.get(string2)) {
			return 1;
		} else {
			return string1.compareTo(string2);
		}
	}

}
