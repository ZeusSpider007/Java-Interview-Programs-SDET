//Delete the First Occurrence of a Character from String
//Using StringBuffer

public class FirstOccurrenceOfCharacterString {

    public static String deleteelement(String str, String ele) {

        StringBuffer sb = new StringBuffer(str);
        int index = sb.indexOf(ele);

        if (index != -1) {
            sb.deleteCharAt(index);
        }

        String result = sb.toString();

        return result;
    }

    public static void main(String[] args) {

        String str = "Hexaware";
        String ele = "e";
        System.out.println(deleteelement(str, ele));
    }
}