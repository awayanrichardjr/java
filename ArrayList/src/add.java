import java.util.ArrayList;

public class add {
    public static void main(String[] args) throws Exception {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("banana");
        // [apple, banana]
        
        fruit.add(0, "avocado");
        // [avocado, apple, banana]
        
        ArrayList<String> fruit2 = new ArrayList<>();
        fruit.add("guava");
        fruit.add("pineapple");
        // fruit.addAll(fruit2);
        // [avocado, apple, banana, guava, pineapple]

        fruit.addAll(1, fruit2);
        // [avocado, apple, banana, guava, pineapple]
        System.out.println(fruit);
    }
}
