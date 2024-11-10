package OOPs;
abstract class Bird{
    public abstract void fly();
    public abstract void eat();
}
class Sparrow extends Bird{
    public void fly(){
        System.out.println("Sparrow flies @short height...");
    }
    public void eat(){
        System.out.println("Sparrow eats again...");
    }
}
class Crow extends Bird{
    public void fly(){
        System.out.println("Crow flies @medium height...");
    }
    public void eat(){
        System.out.println("Crow steals and eat...");
    }
}
// abstact class contains : abstract and concrete methods
// concrete : Method with implementation
// abstract : Method without any implementation
abstract class Eagle extends Bird{
    public void fly(){
        System.out.println("Eagle flies @very height...");
    }
    public abstract void eat();
}
class SerpentEagle extends Eagle{
    public void eat(){
        System.out.println("Serpent eagle eats snakes...");
    }
}
class GoldenEagle extends Eagle{
    public void eat(){
        System.out.println("Golden eagle catches preys over ocean...");
    }
}
class Sky{
    public void allowBird(Bird b){
        b.fly();
        b.eat();
        System.out.println();
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Sky s = new Sky();
        s.allowBird(new Sparrow());
        s.allowBird(new Crow());
        s.allowBird(new SerpentEagle());
        s.allowBird(new GoldenEagle());
    }
}
