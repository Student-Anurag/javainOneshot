package OOPs;
class Sample{
    public void methodOne(String s){
        System.out.println("String version...");
    }
    public void methodOne(Object o){
        System.out.println("Object version...");
    }
}
public class oops3 {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.methodOne("Tirtho");  // String -> Child
        s.methodOne(new Object());  // Object -> Father
        s.methodOne(null);  // null -> String(reference), Object(reference) --- String gets the preference
    }
}
