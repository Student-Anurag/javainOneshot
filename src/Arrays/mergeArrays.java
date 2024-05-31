package Arrays;

public class mergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {11,33,42,62};
        int[] arr2 = {26,54,69,81,94};
        int m = arr1.length;
        int n = arr2.length;
        for(int ele: arr1){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele: arr2){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] res = new int[m+n];
        int i = m-1, j = n-1, k = (m+n)-1;
        while(i>=0 && j>=0){
            if(arr1[i]<=arr2[j]){
                res[k] = arr2[j];
                j--;
            } else if (arr1[i]>=arr2[j]) {
                res[k] = arr1[i];
                i--;
            }
            k--;
        }
        if(i==-1){
            while(j==0){
                res[k] = arr2[j];
                j--;
                k--;
            }
        }
        if(j==-1){
            while(i==0){
                res[k] = arr1[i];
                i--;
                k--;
            }
        }
        for(int ele: res){
            System.out.print(ele+" ");
        }
    }
}
