public class ReverseWordsInStringwithSameOrder {

    public String reverseWordswithsameOrder(String Sentence) {

        String[] words = Sentence.split(" ");
        String result = " ";

        for (String word : words) {

            String reverse = new StringBuilder(word).reverse().toString();
            result = result + reverse + " ";

        }

        return result;

    }

    public static void main(String[] args) {

        ReverseWordsInStringwithSameOrder rrs = new ReverseWordsInStringwithSameOrder();
        String input = "Java is a programming language";
        String resultofreverse = rrs.reverseWordswithsameOrder(input);
        System.out.println(resultofreverse);

    }
}
