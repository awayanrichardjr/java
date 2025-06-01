import java.util.ArrayList;

public class remove {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        // add
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("guava");
        fruit.add("pineapple");
        fruit.add("durian");

        // remove index 
        fruit.remove(0);
        
        // remove Object
        fruit.remove("guava");

        // remove All
        fruit.removeAll(fruit);
        
        // clear fruits
        fruit.clear();

        // remove if...
        fruit.removeIf(name -> name.startsWith("G"));

        // System.out.println(fruit);
    }    
}
