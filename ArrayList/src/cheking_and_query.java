
import java.util.ArrayList;

public class cheking_and_query {

    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();

        fruit.add("apple");
        fruit.add("orange");
        fruit.add("durain");
        fruit.add("mango");
        fruit.add("pineapple");
        fruit.add("banana");
        fruit.add("guava");

        System.out.println(fruit);

        // contains object
        boolean fact = fruit.contains("mango");
        boolean not_fact = fruit.contains("fish");
        System.out.println("Contains mango? " + fact);
        System.out.println("Contains fish? " + not_fact);

        // if the basket are empty 
        boolean quantity = fruit.isEmpty();
        System.out.println(quantity);

        // count the size
        int fruit_size = fruit.size();
        System.out.println(fruit_size);
    }
}
