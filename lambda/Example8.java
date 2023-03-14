// Write a program to Create a List with String more than 2 characters

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Example8 {

    public static void main(String[] args) {
        Supplier < LocalDateTime > supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());
    }
}
