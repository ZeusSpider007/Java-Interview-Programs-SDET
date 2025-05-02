//count the number of occurences of a char in a string
public class CountNoOfOccurencesOfCharInString {

    public int OccurencesofCharinString(String input, char charinput){

        int count = 0;

        for(char c : input.toCharArray()){
        if(c==charinput){
            count++;

        }

        }
        return count;

    }

    public static void main(String[] args) {
        CountNoOfOccurencesOfCharInString c = new CountNoOfOccurencesOfCharInString();
        int result = c.OccurencesofCharinString("Hexaware", 'x');
        System.out.println(result);

    }
}
