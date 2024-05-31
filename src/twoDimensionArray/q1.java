package twoDimensionArray;

public class q1 {
    public static void main(String[] args) {
        int[][] arr =  new int[5][5];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = 10;
            }
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
