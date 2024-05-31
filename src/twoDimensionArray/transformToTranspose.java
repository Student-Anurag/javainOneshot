package twoDimensionArray;

public class transformToTranspose {
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
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};     // only valid for square matrix
        int m = mat.length;
        System.out.println("Matrix is: ");
        print(mat);
        System.out.println("Transpose matrix: ");
        for(int i = 0;i<m;i++){
            for(int j=i+1;j<m;j++){
                int tmp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = tmp;
            }
        }
        print(mat);
    }
}
