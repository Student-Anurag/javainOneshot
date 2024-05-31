package SortingAlgorithms;

public class transformArray {
    public static void main(String[] args) {
        int[] arr = {40,54,11,28,47,66};
        int n = arr.length;
        int x = 0;
        for(int i=0;i<n;i++){
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for(int j=i;j<n;j++){
                if(arr[j]<min && arr[j]>0){
                    min = arr[j];
                    idx = j;
                }
            }
            arr[idx] = x;
            x--;
        }
        for(int i=0;i<n;i++){
            arr[i]*=(-1);
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
