package strings;

import java.util.Arrays;

public class sortString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        // first convert stringbuilder to string then to character array
        char[] ch = sb.toString().toCharArray();
        Arrays.sort(ch);
        for (char ele : ch){
            System.out.print(ele);
        }
    }
}
