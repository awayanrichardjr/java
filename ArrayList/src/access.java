import java.util.ArrayList;
public class access {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("guava");
        fruit.add("durian");
        fruit.add("pineapple");
        fruit.add("orange");
        fruit.add("guava");
        
        // get method
        String selected_fruit = fruit.get(2);
        System.out.println(selected_fruit);
        
        // set method
        fruit.set(0, "mango");
        System.out.println(fruit);

        // index of...
        int fruit_loc = fruit.indexOf(selected_fruit);
        System.out.println(fruit_loc); 

        // last index of... 
        int fruit_end = fruit.lastIndexOf(selected_fruit);
        System.out.println(fruit_end);
    
        // sublist 
        System.out.println(fruit.subList(1,4));
    }
}