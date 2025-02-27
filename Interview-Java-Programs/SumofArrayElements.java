import java.util.Arrays;

public class SumofArrayElements {

    public static int SumofArray(int[] arr) {

        int sum = 0;
        for (int num : arr) {

            sum = sum + num;

        }

        Arrays.sort(arr);
        return sum;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };

        System.out.println("\nThe sum of arrays is " + SumofArray(arr));
    }
}
