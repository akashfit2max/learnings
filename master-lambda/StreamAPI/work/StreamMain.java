package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
	public static void main(String[] args) {

		// creat a list and filter even all even numbers from list

		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(6);
		list1.add(12);
		list1.add(23);

		List<Integer> list2 = Arrays.asList(23, 16, 34, 55, 98);

		List<Integer> list3 = Arrays.asList(2, 4, 50, 21, 22, 67);

		// list1
		// without stream
		List<Integer> listEven = new ArrayList<>();
		for (Integer integer : list1) {
			if (integer % 2 == 0) {
				listEven.add(integer);
			}
		}

		System.out.println(list1);
		System.out.println(listEven);

		// using streamAPI
		List<Integer> newList = list1.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println(newList);

		// numbers > 10;
		List<Integer> numList = list1.stream().filter(num -> num > 10).collect(Collectors.toList());
		System.out.println(numList);
		
		

	}
}
