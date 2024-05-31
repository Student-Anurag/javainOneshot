package advanceSorting;

public class mergeSort {
    public static void mergeSorting(int[] arr){
        int n = arr.length;
        if(n==1) return;
        // create two arrays of n/2 size each
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        // copy pasting
        for(int i=0;i<a.length;i++)  a[i] = arr[i];
        for(int i=0;i<b.length;i++)  b[i] = arr[i+n/2];
        // recursion
        mergeSorting(a);
        mergeSorting(b);
        // merge both a and b
        Merge(a,b,arr);
    }
    public static void Merge(int[] a, int[] b, int[] c){
        int i =0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k++] = a[i++];
            }
            else c[k++] = b[j++];
        }
        while(i<a.length)  c[k++] = a[i++];
        while(j<b.length)  c[k++] = b[j++];
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {80,40,70,10,50,60,90};
        print(arr);
        mergeSorting(arr);
        print(arr);
    }
}
