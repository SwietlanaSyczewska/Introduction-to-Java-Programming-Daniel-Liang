package Exercise_19_10;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	//Second commit!
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arrayList.add(i);
		}

		System.out.println(Arrays.toString(arrayList.toArray()));
		shuffle(arrayList);
		System.out.println(Arrays.toString(arrayList.toArray()));

	}

	public static <E extends Comparable<E>> E max(ArrayList<E> list) {
		E max = list.get(0);
		for(int i = 1; i<list.size(); i++){
			if(list.get(i).compareTo(max)>0){
				max = list.get(i);
			}
		}
		return max;
	}
//this is my third commit
	public static <E> void shuffle(ArrayList<E> list) {
		for (int i = 0; i < list.size(); i++) {
			int random = (int) (Math.random() * list.size());
			E tmp = list.get(random);
			list.set(random, list.get(i));
			list.set(i, tmp);
		}
	}

}
