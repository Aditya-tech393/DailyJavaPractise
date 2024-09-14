class Shape{
    public void area(){
        System.out.println("Displays area.");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}
class Perimeter extends Triangle{
    public void perimeter(int side1,int side2,int side3){
        System.out.println(side1+side2+side3);
    }
}
public class SingleLevel {
    public static void main(String[] args) {
        Perimeter obj=new Perimeter();
        obj.area();
        obj.area(12,10);
        obj.perimeter(12,12,12);
    }
}
