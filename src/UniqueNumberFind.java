import java.util.HashSet;
import java.util.Set;

public class UniqueNumberFind {

    public static void main(String[] args) {
        int [] numbers = {23, 8, 20, 44, 23, 9, 10, 44, 2, 4, 2, 9 };
        Set<Integer> uniqueNumbers = new HashSet<>();

        for(int number : numbers) {
            uniqueNumbers.add(number);
        }

        System.out.println(uniqueNumbers);

        for(int number : numbers) {
            System.out.println(number);
        }
System.out.println("Mojib");
        //HashSet

        Set<String> name = new HashSet<>();

        name.add("Apple");
        name.add("Banana");
        name.add("Orange");
        name.add("Grapes");
        name.add("Pineapple");
        name.add("Mango");
        name.add("Banana");

        boolean newValueAdded  = name.add("ami");
        System.out.println(newValueAdded);

        boolean removed = name.remove("Mango");

        System.out.println("was 'Mango' removed from name");

        for(String fruit : name) {
            System.out.println(name);
        }

    }

}
