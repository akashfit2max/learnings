package work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
	public static void main(String[] args) {
		// stream API- collection process
		// collection /group of objects

		// blank stream
		Stream<Object> empty = Stream.empty();

		// array,object,collection
		String names[] = { "akash", "ashish", "ankit", "divya" };
		Stream<String> stream = Stream.of(names);
		stream.forEach(e -> {
			System.out.println(e);
		});

		// builder pattern
		Stream<Object> stream2 = Stream.builder().build();

		// arrays
		IntStream stream3 = Arrays.stream(new int[] { 2, 4, 5, 6, 7, 8 });
		stream3.forEach(e -> System.out.println(e));

		// list,set
		List<Integer> list3 = Arrays.asList(2, 4, 50, 21, 22, 67);
		Stream<Integer> stream4 = list3.stream();
		stream4.forEach(e -> {
			System.out.println(e);
		});

	}
}
