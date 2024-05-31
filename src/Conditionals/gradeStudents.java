package Conditionals;
import java.util.Scanner;
public class gradeStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of the student: ");
        int marks = sc.nextInt();
        if(marks>=81 && marks<=100) System.out.println("Very Good");
        else if(marks>=61 && marks<=80) System.out.println("Good");
        else if(marks>=41 && marks<=60) System.out.println("Average");
        else System.out.println("fail");
    }
}
