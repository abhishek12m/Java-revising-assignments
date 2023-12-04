package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ArrayListBackwardPrint {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

		ListIterator<String> listIterator = arrayList.listIterator(arrayList.size());

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}

}
