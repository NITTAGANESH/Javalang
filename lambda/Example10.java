// Write a program to find the length of the string using function

import java.util.function.Function;

public class Example10 {
    public static void main(String[] args) {

        Function < String, Integer > function1 = (t) -> t.length();

        Integer integer = function1.apply("Ramesh");
        System.out.println(integer);
    }
}