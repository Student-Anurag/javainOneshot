package strings;

public class append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Abcde");
        sb.append("wxyz");
        System.out.println(sb); // Abcdewxyz
        sb.delete(2,6);
        System.out.println(sb); // Abxyz
        sb.deleteCharAt(2);
        System.out.println(sb); // Abyz
        sb.insert(2,"cx");
        System.out.println(sb);
    }
}
