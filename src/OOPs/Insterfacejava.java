package OOPs;
interface ICalculator{
    // public abstract method
    void add(int a,int b);
    void sub(int a,int b);
}
interface IAdvCalculator{
    // public abstract method
    void mul(int a, int b);
    void div(int a,int b);
}
class CalculatorImpl implements ICalculator,IAdvCalculator{
    // ICalculator
    public void add(int a,int b){
        System.out.println("Addition-> "+(a+b));
    }
    public void sub(int a,int b){
        System.out.println("Subtraction-> "+(a-b));
    }
    // IAdvCalculator
    public void mul(int a,int b){
        System.out.println("Multiplication-> "+(a*b));
    }
    public void div(int a,int b) {
        System.out.println("Division-> "+(a/b));
    }
}
public class Insterfacejava {
    public static void main(String[] args) {
        ICalculator ic = new CalculatorImpl();
        ic.add(100,20);
        ic.sub(100,20);
        IAdvCalculator iadvc = new CalculatorImpl();
        iadvc.mul(100,20);
        iadvc.div(100,20);
    }
}
