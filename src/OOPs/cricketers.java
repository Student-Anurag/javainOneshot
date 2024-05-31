package OOPs;
class Players{
    // instance variable
    public String Name;
    public int Jerseyno;
    Players(String Name,int Jerseyno){  // parameterized constructor
        this.Name = Name;
        this.Jerseyno = Jerseyno;
    }
    // instance method
    public void display(){
        System.out.println("Players name: "+ Name);
        System.out.println("Jersey No: "+ Jerseyno);
    }
}
public class cricketers {
    public static void main(String[] args) {
        // Constructor is called when object is created
        Players p1 = new Players("Ashwin",99);
        p1.display();
        Players p2 = new Players("Rohit",45);
        p2.display();
    }
}
