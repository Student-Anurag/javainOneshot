package OOPs;
class Parent{
    public void property(){
        System.out.println("Land+Cash+Gold");
    }
    public void marry(){
        System.out.println("Arrange marriage");
    }
}
class Child extends Parent{
    // method overriding
    public void marry(){
        // changing the implementation
        System.out.println("Love marriage");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.property();
        p1.marry();
        System.out.println();
        Child c1 = new Child();
        c1.property();
        c1.marry();
        System.out.println();
        Parent p2 = new Child();    // refers to child class(Object Preference)
        p2.property();
        p2.marry();
    }
}
