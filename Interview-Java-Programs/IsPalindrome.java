public class IsPalindrome {

    public static void checkPalindrome(String input) {

        String Reversed = new StringBuilder(input.toLowerCase()).reverse().toString();

        if (Reversed.equals(input.toLowerCase())) {

            System.out.println("\nPalindrome");
        } else {

            System.out.println("\nNot a Palindrome");
        }

    }

    public static void main(String[] args) {

        String inputstr = "Nayan";
        checkPalindrome(inputstr);
    }

}
