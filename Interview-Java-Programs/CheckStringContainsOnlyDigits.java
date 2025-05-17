public class CheckStringContainsOnlyDigits {

    public boolean onlydigits(String str) {

        for (char c : str.toCharArray()) {

            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        CheckStringContainsOnlyDigits csc = new CheckStringContainsOnlyDigits();

        String input = "Nayan123";
        String input2 = "1234";
        boolean result = csc.onlydigits(input2);

        System.out.println("Do String contain only Digits? " + result);

    }
}
