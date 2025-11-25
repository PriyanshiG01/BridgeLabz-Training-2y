package priyanshi;

public class UppercaseNames {
 List<String> names = Arrays.asList("Alice", "Bob", "Carol");
        names.stream().map(String::toUpperCase).forEach(System.out::println); 
}
