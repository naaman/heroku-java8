public class LambdaMain {
    public static void main(String... args) {
        System.getProperties().stringPropertyNames().stream()
                .filter(k -> k.toString().contains("java"))
                .sorted()
                .map(k -> k.toString() + "=" + System.getProperty(k.toString()))
                .forEach(System.out::println);
    }
}
