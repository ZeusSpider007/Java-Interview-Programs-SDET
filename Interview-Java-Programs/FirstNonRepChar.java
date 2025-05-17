public class FirstNonRepChar {

    public Character nonrepchar(String str) {
        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        FirstNonRepChar fc = new FirstNonRepChar();
        String input = "swiss";
        Character result = fc.nonrepchar(input);
        System.out.println(result);
    }
}
