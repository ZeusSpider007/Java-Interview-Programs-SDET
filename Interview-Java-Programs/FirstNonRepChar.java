public class FirstNonRepChar {

    public Character nonrepchar(String str) {

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (str.indexOf(c) == (str.lastIndexOf(c))) {
                return c;
            }
        }

        return null;

    }

    public static void main(String[] args) {

        FirstNonRepChar fc = new FirstNonRepChar();

        String input = "swiss";

        char result = fc.nonrepchar(input);
        System.out.println(result);

    }
}
