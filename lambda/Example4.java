// Write a program to count the empty strings in the given list using lambda expression

import java.util.Arrays;
import java.util.List;

public class Example4{   
	public static void main(String args[]) {   
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk"); 
		long count = strList.stream() .filter(x -> x.isEmpty()) .count(); 
		System.out.printf("List %s has %d empty strings %n", strList, count);
	}
}
