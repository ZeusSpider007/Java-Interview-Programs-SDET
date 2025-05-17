import java.util.ArrayList;
import java.util.List;

public class FindFirstandLastElementInArrayList {

    public static void findfirstandlastElement(ArrayList<Integer> arrlist) {

        if (!arrlist.isEmpty()) {

            System.out.println("The First Element of the Arraylist provided is - " + arrlist.get(0));

            if (arrlist.size() <= 1) {
                System.out.println("The arraylist has only one item!");
            }

            System.out.println("The Last Element of the Arraylist provided is  - " + arrlist.get(arrlist.size() - 1));

        } else {

            System.out.println("The Arraylist is Empty");
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrlist = new ArrayList<>(List.of(1));
        FindFirstandLastElementInArrayList.findfirstandlastElement(arrlist);

    }
}
