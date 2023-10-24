import javax.sound.midi.Soundbank;
import java.util.Collection;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // JAva Stream API

        // Stream Refers to the set of Built-in functions that lets us process the data Quickly and Faster.

        // This Primarily known as Functional Programming
        // the Primary motive of using Streams API is to "Do motive with fewer lines of code"
        // Stream API let us write codes that are short/simple/faster/elegant

        // Let us learn how we can Create Streams & Work with Streams.
        // Here is an Example that Creates and Empty Stream.

        Stream<String> emptyStream = Stream.empty();
        // System.out.println(emptyStream);
        // other methods of creating stream.
        // we can create stream from arrays.

        Collection<String> courses = Arrays.asList("Java","PHP","DotNet","C#","JQuery");
        courses.add("Python");
        Stream<String> coursesStream = courses.stream();
        // System.out.println(coursesStream);

        Stream<String> colors = Stream.of("White","Green","Purple","Black");
        String[] cart = new String[] {"iPhone","harmonKardon","Aura","JBL","Sony"};
        Stream<String> cartStream = Arrays.stream(cart);

        // using stream builder to create stream

        Stream<String> beverages = Stream.<String>builder().add("Tea").add("Coffee").build();

        // Stream.generate()

        Stream<String> emojis = Stream.generate(()->"🎧").limit(10);
        emojis.forEach(i-> System.out.println(i));
    }
}