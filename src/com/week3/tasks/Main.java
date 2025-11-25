package com.week3.tasks;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = nums.stream()
                                   .filter(n -> n % 2 == 0)
                                   .map(n -> n * 10)
                                   .collect(Collectors.toList());
        System.out.println(result);  // [20, 40]
    }
}

//record Product(String name, double price) {}
//
//public class Main {
//    public static void main(String[] args) {
//        Product p = new Product("Laptop", 55000.0);
//        System.out.println(p);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        Consumer<Integer> square = n -> System.out.println(n * n);
//
//        square.accept(5); // prints 25
//        }

//public class Main {
//    public static void main(String[] args) {
//
//        Predicate<String> isValidUsername = name -> name.length() > 5;
//
//        String username = "arjun10";
//        System.out.println(isValidUsername.test(username)); // true
//    }
//}