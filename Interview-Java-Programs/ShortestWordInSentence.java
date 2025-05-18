public class ShortestWordInSentence {

    public String findShortestWord(String sentence) {

        String[] words = sentence.split(" ");
        String shortest = words[0];

        for (String word : words) {

            if (word.length() < shortest.length()) {

                shortest = word;
            }
        }

        return shortest;

    }

    public static void main(String[] args) {

        ShortestWordInSentence sws = new ShortestWordInSentence();
        String result = sws.findShortestWord("Hello my friend, how are you?");
        System.out.println(result);

    }
}
