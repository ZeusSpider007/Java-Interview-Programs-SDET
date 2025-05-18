import java.util.Arrays;

public class FindMaxProductofTwoIntinArray {

    public int maxproductfromarray(int[] inputArray) {

        int lenOfArray = inputArray.length;
        Arrays.sort(inputArray);

        int prod1 = (inputArray[lenOfArray - 1]) * (inputArray[lenOfArray - 2]);
        int prod2 = (inputArray[0]) * (inputArray[1]);

        if(prod1>prod2){

            System.out.println("The two numbers forming max product are "+ (inputArray[lenOfArray - 1]) +" And "+(inputArray[lenOfArray - 2]));
        }

        else {
             System.out.println("The two numbers forming max product are "+ (inputArray[0]) +" And "+(inputArray[1]));

        }
        return Math.max(prod1, prod2);

    }

    public static void main(String[] args) {
        FindMaxProductofTwoIntinArray fa = new FindMaxProductofTwoIntinArray();
        int[] inputarray = {-2000,3,5, 100,24,1,7,350}; 
       int result =  fa.maxproductfromarray(inputarray);

       System.out.println(result);

    }
}