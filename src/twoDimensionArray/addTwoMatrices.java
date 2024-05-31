package twoDimensionArray;

public class addTwoMatrices {
    public static void main(String[] args) {
        int[][] arr1 = {{3,9,6},{2,7,2},{1,1,4}};
        int[][] arr2 = {{5,9,0},{4,5,7},{7,3,1}};
        int m = arr1.length;
        int n = arr1[0].length;
        int[][] res = new int[m][n];
        System.out.println("First array: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Second array: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Array after addition: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
