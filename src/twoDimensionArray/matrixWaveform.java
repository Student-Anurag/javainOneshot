package twoDimensionArray;

public class matrixWaveform {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int m = mat.length;
        int n = mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Waveform Matrix: ");
        for(int i=0;i<m;i++){
            if(i % 2 == 0){
                for(int j=0;j<n;j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
