package OOPs;
class calculator{
    public void add(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public void add(int a,int b,int c){
        int sum = a+b+c;
        System.out.println(sum);
    }
    public void add(int a,int b,int c,int d){
        int sum = a+b+c+d;
        System.out.println(sum);
    }
}
class AdvanceCalculator{
    // Var-Args --> 0 to n
    public void add(int... args){
        int res = 0;
        for(int data : args){
            res+=data;
        }
        System.out.println(res);
    }
}
public class VarArgs {
    public static void main(String[] args) {
        calculator cal = new calculator();
        cal.add(10,20);
        cal.add(10,20,30);
        cal.add(10,20,30,40);
        System.out.println();
        AdvanceCalculator advCal = new AdvanceCalculator();
        advCal.add(10,20);
        advCal.add(10,20,30);
        advCal.add(10,20,30,40);
    }
}
