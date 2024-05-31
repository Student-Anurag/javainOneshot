package strings;
public class isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] a = new char[128];
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            int idx = (int)ch1;
            if(a[idx] == '\0')  a[idx] = ch2;
            else{
                if(a[idx] != ch2)   return false;
            }
        }
        char[] b = new char[128];
        for(int i=0;i<t.length();i++){
            char ch1 = t.charAt(i);
            char ch2 = s.charAt(i);
            int idx = (int)ch1;
            if(b[idx] == '\0')  b[idx] = ch2;
            else{
                if(b[idx] != ch2)   return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        isIsomorphic(s,t);
    }
}
