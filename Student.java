import java.util.Scanner;

public class Student {
    String name;
    int age;

    Student(){
        System.out.println("Constructor is called.");
    }


    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        Student obj=new Student("Alexa",19);
    }
}
