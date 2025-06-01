import java.util.ArrayList;

public class add {
    public static void main(String[] args) throws Exception {
        ArrayList<String> word = new ArrayList<String>();

        word.add("Hello");
        word.add("World");
        System.out.println(word);

        for (String storage : word) {
            System.out.println(storage);
        }

        word.add(0, "Hey");
        System.out.println(word);
    }
}
