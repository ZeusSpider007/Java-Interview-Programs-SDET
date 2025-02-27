import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrays {

    public static int[] mergearrays(int[] array1, int[] array2) {

        return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray();
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 3, 5, 7 };
        int[] array2 = { 2, 4, 6, 8 };

        int[] mergedarray = mergearrays(array1, array2);
        Arrays.sort(mergedarray);

        System.out.println("\n" + Arrays.toString(mergedarray));

    }

}