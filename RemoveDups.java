import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class RemoveDups {
    public static String RemoveDups(String input) {
        char[] inputAsChar = input.toCharArray();
        StringBuilder returnString = new StringBuilder();
        Set<Character> set = new HashSet<>();

        for (char curr : inputAsChar) {
            set.add(curr);
        }
        for (Character ele : set) {
            returnString.append(ele);
        }
        return returnString.toString();


    }
}
