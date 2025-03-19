package Java_Colletions_Framework.Set;
/* Java LinkedHashSet
The LinkedHashSet class in Java is a part of the java.util package and extends HashSet. 
It maintains a **linked list of the entries** in the set, preserving the **insertion order**.

While it has all the features of a HashSet, the main difference is that LinkedHashSet maintains the order 
in which elements were inserted.

1. Key Features of LinkedHashSet
✅ Unique Elements – Does not allow duplicates.
✅ Maintains Insertion Order – Unlike HashSet, it keeps elements in the order they were added.
✅ Moderate Performance – Slightly slower than HashSet due to extra memory for maintaining order.
✅ Null Allowed – A LinkedHashSet can store one null value.
✅ Not Synchronized – It is not thread-safe, so use Collections.synchronizedSet() if needed.

✅ You can use any wrapper class (Integer, Double, Character, Boolean, etc.) in a LinkedHashSet.
✅ You cannot use primitive types like int, double, char, etc. (Use their wrapper classes instead).
    Set<Integer> numbers = new LinkedHashSet<>();
    Set<Double> decimals = new LinkedHashSet<>();
    Set<Character> letters = new LinkedHashSet<>();
    Set<Boolean> flags = new LinkedHashSet<>();

Use HashSet when you just need unique elements and don’t care about order.
Use LinkedHashSet when you need unique elements and want to preserve the order of insertion.

*/
import java.util.LinkedHashSet;
import java.util.Iterator;

public class MyLinkedHashSet {
    public static void main(String[] args) {
        // 1. Creating a LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // 2. Adding Elements
        set.add("Nayan");
        set.add("Spider");
        set.add("Zeus");
        set.add("Bitcoin");
        set.add("Nayan"); // Duplicate, won't be added

        // 3. Checking if an Element Exists
        System.out.println(set.contains("Zeus")); // true
        System.out.println(set.contains("World")); // false

        // 4. Removing Elements
        set.remove("Bitcoin");

        // 5. Finding the Size of the LinkedHashSet
        System.out.println(set.size()); // prints size of the set

        // 6. Iterating Over Elements (order is maintained)
        for (String item : set) {
            System.out.println(item);
        }

        // 7. Using an Iterator
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 8. Clearing the LinkedHashSet
        set.clear();
    }
}


