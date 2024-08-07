Java Stream API - Quick Guide
Imagine the Java Stream API as a magical river that helps you work with collections of items, like a list of numbers or a bunch of names. This river has special powers that let you do things to all the items in the collection in a very easy and organized way.

Main Concepts

1. Source: Starting Point
   The source is where the river begins. This could be a list, an array, or any other collection of items. For example, a list of numbers like [1, 2, 3, 4, 5].

2. Intermediate Operations: The Magical Steps
   These are the magical steps you can perform on the items in the river. Each step transforms the items in some way, like filtering, sorting, or mapping them to something else.

Filter: Imagine you have a net that only lets certain items pass through. For example, you want only the even numbers from your list.

> List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
> Stream<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0);

This makes the river flow with only [2, 4].

Map: Think of a magic wand that changes each item in the river. For example, doubling each number.

> Stream<Integer> doubled = evenNumbers.map(n -> n \* 2);
> Now the river flows with [4, 8].

Sorted: Imagine you have a tool that arranges items in order as they float down the river.

> Stream<Integer> sortedNumbers = numbers.stream().sorted();
> This arranges the items in [1, 2, 3, 4, 5].

3. Terminal Operations: The End Point
   These are the final actions that end the river. They give you a result or perform some action, like collecting the items into a list or adding them up.

Collect: This takes all the items from the river and gathers them into a list or another collection.

> List<Integer> result = doubled.collect(Collectors.toList());
> Now, result is [4, 8].

forEach: This lets you do something with each item, like print it out.

> numbers.stream().forEach(n -> System.out.println(n));

This prints each number in the list.

Reduce: This combines all the items into a single value, like adding them up.

> int sum = numbers.stream().reduce(0, (a, b) -> a + b);
> sum will be 15.

Putting It All Together
Here’s a full example where we filter even numbers, double them, and then collect them into a list:

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
public static void main(String[] args) {
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = numbers.stream()  // Start the river with numbers
            .filter(n -> n % 2 == 0)             // Filter to get even numbers
            .map(n -> n * 2)                     // Double each number
            .collect(Collectors.toList());       // Collect into a list

        System.out.println(result);              // Output: [4, 8]
    }

}

Summary
The Stream API is like a magical river that flows from a collection of items, passes through different magical steps to transform the items, and finally gathers them into a result. It makes working with collections fun and powerful!

Keep this guide handy, and you'll be able to understand and use Java Streams like a pro!
