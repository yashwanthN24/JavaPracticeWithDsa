package AdvanceJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApi {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = numbers.stream() // Start the river with numbers
                .filter(n -> n % 2 == 0) // Filter to get even numbers
                .map(n -> n * 2) // Double each number
                .collect(Collectors.toList()); // Collect into a list

        System.out.println(result); // Output: [4, 8]
    }

}
