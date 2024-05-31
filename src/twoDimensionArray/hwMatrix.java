package twoDimensionArray;

public class hwMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int m = mat.length; // no of rows = 4
        int n = mat[0].length;  // no of columns = 3
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(" Inversed Waveform Matrix: ");
        for(int j=0;j<n;j++){
            if(j % 2 == 0){
                for(int i=0;i<m;i++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
            else{
                for(int i = m-1; i >=0; i--){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
