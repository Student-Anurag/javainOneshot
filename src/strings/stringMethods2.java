package strings;

public class stringMethods2 {
    public static void main(String[] args) {
        String str = "Acknowledge Me";
        // str.toLowerCase() --> No change in str
        // str.toUpperCase() --> No change in str
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        String a = "Rohit";
        String b = "45";
        System.out.println(a.concat(b));
        // '+' operator --> Conacatenates two or more strings/characters/integers
        a = a + b;
        System.out.println(a);
        String x = "De Bruyne";
        x = x + 17;
        System.out.println(x);
        System.out.println("abc"+10+20);
        System.out.println(10+20+"abc");
    }
}
