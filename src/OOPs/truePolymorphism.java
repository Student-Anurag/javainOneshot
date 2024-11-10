package OOPs;
class Plane{
    public void takeOff(){
        System.out.println("Plane is ready to take off...");
    }
    public void fly(){
        System.out.println("Plane is ready to fly...");
    }
    public void land(){
        System.out.println("Plane is ready for landing");
    }
}
class passengerPlane extends Plane{
    public void takeOff(){
        System.out.println("passengerPlane is ready to take off...");
    }
    public void fly(){
        System.out.println("passengerPlane is ready to fly...");
    }
    public void land(){
        System.out.println("passengerPlane is ready for landing");
    }
}
class fighterPlane extends Plane{
    public void takeOff(){
        System.out.println("fighterPlane is ready to take off...");
    }
    public void fly(){
        System.out.println("fighterPlane is ready to fly...");
    }
    public void land(){
        System.out.println("fighterPlane is ready for landing");
    }
}
class cargoPlane extends Plane{
    public void takeOff(){
        System.out.println("cargoPlane is ready to take off...");
    }
    public void fly(){
        System.out.println("cargoPlane is ready to fly...");
    }
    public void land(){
        System.out.println("cargoPlane is ready for landing");
    }
}
class airport {
    public void allowPlane(Plane p){
        p.takeOff();
        p.fly();
        p.land();
        System.out.println();
    }
}
public class truePolymorphism {
    public static void main(String[] args) {
        Plane p = new Plane();
        airport a = new airport();
        // true poymorphism
        a.allowPlane(new passengerPlane());
        a.allowPlane(new fighterPlane());
        a.allowPlane(new cargoPlane());
    }
}
