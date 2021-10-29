package work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(20, 30, 12, 34, 65, 78);
		List<String> names = Arrays.asList("akash", "ashish", "mamata", "ajay", "nitin");

		// predicate
		List<String> newNames = names.stream().filter(e -> e.startsWith("a")).collect(Collectors.toList());
		System.out.println(newNames);

		// map
		// each element operation lk working on numbers

		list.stream().map(e -> e * e).forEach(e -> {
			System.out.print(e + " ");
		});

		System.out.println();
		newNames.stream().forEach(System.out::println);

		// min,max,sorted

		list.stream().sorted().forEach(System.out::println);

		Integer minElement = list.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println("min" + minElement);

		System.out.println("max element " + list.stream().max((x, y) -> x.compareTo(y)).get());
	}

}
