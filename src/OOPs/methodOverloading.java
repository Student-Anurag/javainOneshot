package OOPs;
class Calculator{
    public void add(int a,int b) {
        System.out.println("int-int argument");
    }
    public void add(float a,float b){
        System.out.println("float-float argument");
    }
    public void add(double a,double b){
        System.out.println("double-double argument");
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10,20);
        c.add(10.6f,6.8f);
        c.add(3.4,7.1);
    }
}
