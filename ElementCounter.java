import java.util.*;
import java.util.stream.Collectors;

public class ElementCounter {

    public static Map<Integer, Long> countOccurrences(List<Integer> list) {
        return list.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 1, 5, 4);

        Map<Integer, Long> elementCount = countOccurrences(numbers);

        System.out.println("Element counts: " + elementCount);
    }
}
