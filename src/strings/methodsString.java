package strings;

public class methodsString {
    public static void main(String[] args) {
        String str = "Christiano Ronaldo";
        System.out.println("Length of string: "+str.length());
        System.out.println(str.charAt(9));      // charAt() --> returns character at the specified index
        System.out.println(str.charAt(11));
        System.out.println(str.indexOf('l'));   // indexOf() --> returns index of the specified character
        // If there exist multiple characters indexOf() returns the first occured index of the specified character
        System.out.println(str.indexOf('r'));
        System.out.println(str.lastIndexOf('o'));
        String x = "ajc";
        String y = "aec";
        System.out.println(x.compareTo(y));    // compareTo() --> returns the ASCII diffrence of str1 and str2
        String s = "Etihad Airways";
        System.out.println(s.contains("way"));  // contains() --> returns true if the string contains the input parameter
        System.out.println(s.startsWith("Etih"));
    }
}
