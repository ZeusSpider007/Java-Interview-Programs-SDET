import java.util.Arrays;

public class SecondLargestNumberfromArray {

    public static int findSecondLargestNum(int[] arr){

        if(arr.length<2){
            System.out.println("Enter at least 2 elements in array");
        }

        Arrays.sort(arr);
        return arr[arr.length-2];

    } 


    public static void main(String[] args) {
        
        int[] arr = {1,23,3,4,5,6,6,7,7234,62,356};
        System.err.println("\n The second largest array is = > "+findSecondLargestNum(arr));

    }
    
}
