
public class greeting {

    public static void main(String[] args) throws Exception {
        // displaying 
        System.out.println("Hello, World!");

        String greeting = "Hello, World!";
        System.out.println(greeting);

        // separated 
        String first_word = "Hello";
        String second_word = "World";

        // combined 
        System.out.println(first_word + ", " + second_word + "!");

        // concatinate 
        System.out.println(first_word + ", ".concat(second_word) + "!");
    }
}
