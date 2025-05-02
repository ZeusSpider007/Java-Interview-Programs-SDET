import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharFromString {
    
public static void main(String[] args) {
    
String input = "Automation";

char[] ch = input.toCharArray();

Set<Character> set = new LinkedHashSet<>();
for(char c: ch){
    set.add(c);
}

StringBuilder sb = new StringBuilder();

for (char c: set){
    sb.append(c);
}

System.out.println(sb);



}




}
