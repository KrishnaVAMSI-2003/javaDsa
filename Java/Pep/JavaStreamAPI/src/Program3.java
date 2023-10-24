import java.util.Arrays;
import java.util.stream.Stream;

public class Program3 {
    public static void main(String[] args) {
        // Accessing Stream Data using ForEach loop
        String[] cart = new String[]{"iPhone", "harmonKardon", "Aura"};
        Stream<String> cartStream = Arrays.stream(cart);
        cartStream.forEach(anything -> System.out.println(anything));
        // Filtering
    }
}
