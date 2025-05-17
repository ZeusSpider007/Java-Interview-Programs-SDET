public class CountVowelsandConsonants {

    public void countvowelandconsonentfromstring(String str) {

        int vowels = 0;
        int consonents = 0;
        String finalString = str.toLowerCase();

        for (char c : finalString.toCharArray()) {

            if (Character.isLetter(c)) {

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonents++;
                }
            }
        }

        System.out.println("Total Vowels -> " + vowels);
        System.out.println("Total Consonents -> " + consonents);

    }

    public static void main(String[] args) {

        CountVowelsandConsonants cac = new CountVowelsandConsonants();
        String input = "Hello, World!";
        cac.countvowelandconsonentfromstring(input);

    }
}
