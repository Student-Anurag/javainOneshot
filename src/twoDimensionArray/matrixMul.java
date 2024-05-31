package twoDimensionArray;

public class matrixMul {
    public static void print(int[][] arr){
        int m = arr.length;
        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
       int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};
       int[][] mat2 = {{1,2,1,5},{3,2,3,7},{7,6,7,9}};
        if(mat1[0].length != mat2.length){
            System.out.println("Matrix multiplication not possible");
        }
        else{
            int ans[][] = new int[mat1.length][mat2[0].length];
            for(int i=0;i<ans.length;i++){
                for(int j=0;j<ans[0].length;j++){
                    for(int k=0;k<mat1[0].length;k++){
                        ans[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
            print(mat1);
            print(mat2);
            print(ans);
        }
    }
}
