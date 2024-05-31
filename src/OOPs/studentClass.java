package OOPs;
class Student{
    // data security
    private int Roll;
    private String Name;
    private String Address;
    // setter methods
    public void setRoll(int Roll){
        this.Roll = Roll;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setAddress(String Class){
        this.Address = Address;
    }
    // getter methods
    public int getRoll(){
        return Roll;
    }
    public String getName(){
        return Name;
    }
    public String getAddress(){
        return Address;
    }
}
public class studentClass {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRoll(3);
        s.setName("Barsha");
        s.setAddress("Kalyani");
        System.out.println("Roll is: "+ s.getRoll());
        System.out.println("Name is: "+ s.getName());
        System.out.println("Address is: "+ s.getAddress());
    }
}
