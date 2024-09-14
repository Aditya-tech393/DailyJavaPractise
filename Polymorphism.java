public class Polymorphism {
    public void student(String name){
        System.out.println(name);
    }
    public void student(int age){
        System.out.println(age);
    }
    public void student(String name,int age){
        System.out.println("The name is "+name+" and the age is "+age);
    }

    public static void main(String[] args) {
        Polymorphism obj =new Polymorphism();
        obj.student("Alexa");
        obj.student(19);
        obj.student("Alexa",19);
    }
}
