import java.util.Arrays;

class isAnagram{
public static boolean isAnagramchecker(String str1, String str2){


 str1 = str1.replaceAll("\\s", "");
 str2 = str2.replaceAll("\\s", "");

 if(str1.length()!= str2.length()){
    return false;
 }

 char[] char1 = str1.toLowerCase().toCharArray();
 char[] char2 = str2.toLowerCase().toCharArray();

 Arrays.sort(char1);
 Arrays.sort(char2);

 return Arrays.equals(char1, char2);

}


    public static void main(String[] args) {
        
        String str1 = "silent";
        String str2 = "listen";
        System.out.println("\n");
        System.out.println(isAnagramchecker(str1,str2));

    }
}