package Arrays;
import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10);  //  add() --> initialize
        arr.add(1,40);
        arr.add(2,90);
        arr.add(3,30);
        arr.add(4,55);
        arr.add(5,88);
        System.out.println(arr);
        for(int i=0;i<6;i++){
            System.out.print(arr.get(i)+" ");   // get()  --> print
        }
        arr.set(4,43);  //  set()  --> modify
        for(int i=0;i<6;i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
