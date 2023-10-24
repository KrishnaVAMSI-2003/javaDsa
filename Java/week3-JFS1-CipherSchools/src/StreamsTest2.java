import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class StreamsTest2 {
    public static void main(String[] args) {
        // Map method is used to map each element to its corresponding function

        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = myList.stream().map(e -> e * e).collect(Collectors.toList());

        // myList : ordinary collection Object with no stream Support

        System.out.println(result);

    }
}