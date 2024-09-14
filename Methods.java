public class Methods {
    public static void mydetails(){
        String name="My name is Alexa";
        int age=21;
        float height=5.11f;
        System.out.println(name);
        System.out.println("My age is : "+age);
        System.out.println("My height is : "+height);
    }
    public static void perimeter_of_rect(int length,int breadth){
        double perimeter=2*(length+breadth);
        System.out.println("The perimeter of rectangle is: "+perimeter);
    }
    public static double speed_of_object(double distance, double time){
        double speed=distance/time;
        System.out.println("Speed is : "+speed);
        return speed;
    }

    public static void main (String [] args){
//        mydetails();
        perimeter_of_rect(5,5);
        double calc_top_speed=speed_of_object(100,10);
        double top_speed=calc_top_speed*40;
        System.out.println(top_speed);
    }
}
