public class MostFrequentCharInString {

    public char returnmostfrequentchar(String input) {

        String inputfinal = input.toLowerCase();
        char[] chars = inputfinal.toCharArray();

        char mostfreqchar = '\0';
        int MaxCount = 0;

        for (char c : chars) {

            int count = 0;

            for (char cc : chars) {

                if (cc == c) {
                    count++;
                }

            }

            if (count > MaxCount) {
                MaxCount = count;
                mostfreqchar = c;

            }

        }

        return mostfreqchar;

    }

    public static void main(String[] args) {

        MostFrequentCharInString msc = new MostFrequentCharInString();
        System.out.println(msc.returnmostfrequentchar("Nayan"));

    }

}