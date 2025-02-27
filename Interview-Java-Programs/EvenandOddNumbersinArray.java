public class EvenandOddNumbersinArray {

    public static int[] EvenandOddCount(int[] arr) {

        int evencount = 0;

        int oddcount = 0;

        for (int num : arr) {

            if (num % 2 == 0) {
                evencount = evencount + 1;

            } else {
                oddcount = oddcount + 1;
            }

        }
        return new int[] { evencount, oddcount };
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int[] results = EvenandOddCount(arr);
        System.out.println("\n - The Even count is " + results[0]);
        System.out.println("\n - The Odd count is " + results[1]);

    }
}
