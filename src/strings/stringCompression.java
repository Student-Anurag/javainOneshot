package strings;

public class stringCompression {
    public static void main(String[] args) {
        String str = "aabcccddeeeeeefgg";
        char[] ch = str.toCharArray();
        String ans = "";
        int i=0,j=0;
        while(j<ch.length){
            if(ch[j] == ch[i]){
                j++;
            }
            else{
                ans += ch[i];
                int len = j-i;
                if(len>1)   ans += len;
                i=j;
            }
        }
        // for last group of string
        ans += ch[i];
        int len = j-i;
        if(len>1)   ans += len;
        System.out.println(ans);
    }
}
