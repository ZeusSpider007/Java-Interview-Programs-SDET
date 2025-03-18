package Java_Oops_Concepts.Java_Colletions_Framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*Java ArrayList
The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified 
(if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and 
removed from an ArrayList whenever you want.

1. Key Features of ArrayList
✅ Dynamic Size – Grows automatically when elements are added.
✅ Fast Random Access – Provides O(1) time complexity for get() operations.
✅ Maintains Insertion Order – Elements are stored in the order they were inserted.
✅ Duplicates Allowed – You can store duplicate elements.
✅ Not Synchronized – It is not thread-safe, so use Collections.synchronizedList() if needed.


✅ You can use any wrapper class (Integer, Double, Character, Boolean, etc.) in an ArrayList.
✅ You cannot use primitive types like int, double, char, etc. (Use their wrapper classes instead).
    List<Integer> numbers = new ArrayList<>();
    List<Double> decimals = new ArrayList<>();
    List<Character> letters = new ArrayList<>();
    List<Boolean> flags = new ArrayList<>();



*/

public class MyArrayList {

    public static void main(String[] args) {

        // Creates an empty ArrayList with an initial capacity.
        ArrayList<String> list = new ArrayList<>();

        // 1-Adding Elements
        list.add("Nayan");
        list.add("Spider");
        list.add("Zeus");
        // list.add(1); //gives error as 1 is int and the Arraylist declared is a
        // String.

        // 2-Add elements at a specific index
        list.add(1, "Bitcoin");

        // 3-Accessing Elements
        String fetchname = list.get(2); // Retrieves the element at index 2
        System.out.println(fetchname); // Output: Bitcoin

        // 4-Updating an Element
        list.set(0, "Avalanche");

        // 5-Removing Elements
        // 5.1 - Removal by Index
        list.remove("Avalanche");

        // 5.2 - Removal by Value
        list.remove(0);

        // 6-Checking if an Element Exists
        Boolean x = list.contains("Zeus");
        Boolean y = list.contains("World");
        System.out.println(x);// prints true
        System.out.println(y);// prints false

        // 7- Finding the Size of the ArrayList
        int sizeoflist = list.size();
        System.out.println(sizeoflist);// prints size of list

        // 8- Sorting ArrayList
        Collections.sort(list);

        // 9 - Iterating Over Elements

        // 9.1- Using a for-each loop
        for (String item : list) {
            System.out.println(item);
        }

        // 9.2- - Using an Iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 10- Clearing all Elements from ArrayList.
        list.clear();

    }
}
