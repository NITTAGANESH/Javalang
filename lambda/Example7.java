// Write a program to create a method filter that takes list of strings and predicate(name starts with J & length more than 4) and filter the data using predicate and print

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example7 {
	public static void main(String args[]) {
		List<String> countries = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		Predicate<String> nameStartWithJ=(str)->str.startsWith("F");
		Predicate<String> fourLetterLong = (n) -> n.length() > 4;
		Predicate<String> p=nameStartWithJ.and(fourLetterLong);
		filter(countries,p );
	}

	public static void filter(List names, Predicate condition) {
		names.stream()
		.filter((name) -> (condition.test(name)))
		.forEach((name) -> {
			System.out.println(name + " ");
		});
	}

}
