public class SearchanElement {

    //search element from the array and return the index of the element
    public static int returnelementindex(int[] arr, int targetelement) {

        for (int i = 0; i <= arr.length; i++) {

            if (arr[i] == targetelement) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 34, 5, 5 };
        System.err.println("\nindex is " + returnelementindex(arr, 34));

    }
}
