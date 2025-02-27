import java.util.Scanner;

public class StringReverse {

    public static String reversestr(String arr) {

        String reversed = new StringBuilder(arr).reverse().toString();

        return reversed;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("_____________________________");
        System.out.println("Enter the String");

        String inputString = scan.nextLine();

        scan.close();

        String ReversedString = reversestr(inputString);
        System.out.println("Reversed String is "+ReversedString);

    }

}