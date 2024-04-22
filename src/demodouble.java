import java.util.stream.*;

class demodouble {
    public static void main(String[] args)
    {

        Stream<String> stream
                = Stream.of("Hello", "World", "Hello", "tech", "Computer","Portal");

        stream.forEach(System.out::println);
    }
}
