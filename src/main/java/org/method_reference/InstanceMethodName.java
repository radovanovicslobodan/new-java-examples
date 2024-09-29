package org.method_reference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InstanceMethodName {
    public static void main(String[] args) {
        List<String> strings = Arrays
                .asList("how", "to", "do", "in", "java", "dot", "com");

        List<String> sorted = strings
                .stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());

        List<String> sorted1 = strings
                .stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        System.out.println(sorted);

        List<String> sortedAlt = strings
                .stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        System.out.println(sortedAlt);
    }
}