import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) throws Exception {
        ArrayList<String> name = new ArrayList<String>();

        name.add("Hello");
        name.add("World");

        System.out.println(name);

        for (String storage : name) {
            System.out.print(storage);
        }
    }
}
