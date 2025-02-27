import java.util.Arrays;

public class MaxandMinElementofArray {
    
public static int[] MinandMaxele(int[] arr){

    int min = Arrays.stream(arr).min().getAsInt();
    int max = Arrays.stream(arr).max().getAsInt();

    return new int[]{min, max};
}

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,5,46,7,7};
        int[] results = MinandMaxele(arr);

        System.out.println("\n Min Value==> "+results[0]);
        System.out.println("\n Max Value==> "+results[1]);
    }
}
