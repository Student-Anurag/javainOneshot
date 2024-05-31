package OOPs;
class Person{
    // Parent Class or Super Class
    public String Name;
    public int Age;
    public String Address;
}
class Students extends Person{
    // Derived Class or Child Class
    public int Marks;
    public String Grade;
    Students(String Name,int Age,String Address,int Marks,String Grade){
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
        this.Marks = Marks;
        this.Grade = Grade;
    }
    public void display(){
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Address: "+Address);
        System.out.println("Marks: "+Marks);
        System.out.println("Grade: "+Grade);
    }
}
public class oops2 {
    public static void main(String[] args) {
        Students s1 = new Students("Anurag",19,"Naihati",444,"Excellent");
        s1.display();
    }
}
