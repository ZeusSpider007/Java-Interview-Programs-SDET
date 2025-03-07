import java.util.Arrays;

public class RemoveDuplicates {

  // remove duplicate elments from numeric array

  public static int[] RemoveDuplicateElement(int[] arr) {

    return Arrays.stream(arr).distinct().toArray();

  }

  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 5, 5, 6, 6, 6, 7, 7, 8, 8 };
    System.out.println("The unique array is " + Arrays.toString(RemoveDuplicateElement(arr)));

  }

}
