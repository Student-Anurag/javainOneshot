package Recursion;

public class Methodscalling {
    public static void banana(){
        System.out.println("Hi I am in banana");
    }
    public static void apple(){
        banana();
        System.out.println("Hi I am in apple");
    }
    public static void main(String[] args) {
        System.out.println("Hi I am in Main");
        apple();
    }
}
