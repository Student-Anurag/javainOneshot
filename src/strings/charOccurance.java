package strings;

public class charOccurance {
    public static void main(String[] args) {
        String s = "auauaauufgaou";
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = (int)(ch-97);
            freq[idx]++;
        }
        int maxFreq = -1;
        for(int i=0;i<freq.length;i++){
            maxFreq = Math.max(maxFreq,freq[i]);
        }
        for(int i=0;i<freq.length;i++){
           if(maxFreq == freq[i]){
                char c = (char)(i+97);
                System.out.print(c+" ");
           }
        }
    }
}
