package Arrays;

public class previousGreatestEle {
    public static void main(String[] args) {
        int[] arr = {24,13,10,66,43,34};
        int n =arr.length;
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] ans = new int[n];
        ans[0] = -1;
        int pge = arr[0];
        for(int i=1;i<n;i++){
            ans[i] = pge;
            pge = Math.max(pge,arr[i]);
        }
        for(int ele: ans){
            System.out.print(ele+" ");
        }
    }
}
