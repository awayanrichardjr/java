import java.util.ArrayList;

public class add {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("banana");
        // [apple, banana]
        
        fruit.add(0, "avocado");
        // [avocado, apple, banana]
        
        ArrayList<String> fruit2 = new ArrayList<>();
        fruit2.add("guava");
        fruit2.add("pineapple");
        // [guava, pineapple]
        
        fruit.addAll(fruit2);
        // [avocado, apple, banana, guava, pineapple]
        
        fruit.addAll(0, fruit2);
        // [guava, pineapple, avocado, apple, banana, guava, pineapple]
        
        System.out.println(fruit);
    }
}
