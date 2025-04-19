package org.daily.java.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDayOne {

    Long countEvenNumbers(List<Integer> input) {
        return input.stream().filter(i -> i%2 == 0).count();
    }

    List<String> filterNames(List<String> input) {
        return input.stream().filter(i -> i.startsWith("A")).collect(Collectors.toList());
    }

    Integer findMax(List<Integer> input) {
        return input.stream().max(Integer::compare).orElse(-1);
    }

    Integer findSecondLargest(List<Integer> input) {
        Optional<Integer> output = input.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        return output.isPresent() ? output.get() : -1;
    }

    @Test
    public void test() {
        assert countEvenNumbers(List.of(1, 2, 3, 4, 5, 6)) == 3;
        assert countEvenNumbers(List.of(7, 9, 11, 13)) == 0;
        assert countEvenNumbers(List.of(2, 4, 6, 8, 10)) == 5;
    }

    @Test
    public void test2() {
        assert filterNames(List.of("Alice", "Bob", "Anna", "Charlie")).equals(List.of("Alice", "Anna"));
        assert filterNames(List.of("John", "Doe", "Mark")).equals(List.of());
        assert filterNames(List.of("Adam", "Alex", "Amy", "Aria")).equals(List.of("Adam", "Alex", "Amy", "Aria"));
    }

    @Test
    public void test3() {
        assert findMax(List.of(10, 5, 20, 8)) == 20;
        assert findMax(List.of(-5, -1, -3)) == -1;
        assert findMax(List.of()) == -1;
    }

    @Test
    public void test4() {
        assert findSecondLargest(List.of(10, 5, 20, 8)) == 10;
        assert findSecondLargest(List.of(1, 1, 1)) == -1;
        assert findSecondLargest(List.of(50, 30, 40, 20)) == 40;
    }
}
