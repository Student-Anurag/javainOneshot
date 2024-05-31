package strings;

public class equals {
    public static void main(String[] args) {
        String s = "abcde";
        String t = "abc";
        t += "de";
        System.out.println(t);
        //  == compares the address of two strings
        System.out.println(s==t);  // ---> return false as s and t doesn't point to the same string
        System.out.println(s.equals(t));    // ---> return true as it compares the string s and t
    }
}
