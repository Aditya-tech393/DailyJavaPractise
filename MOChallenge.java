public class MOChallenge {
    public static void area(int side){
        int area_sq=side*side;
        System.out.println("Area :"+area_sq);
    }
    public static void area(int length, int breadth){
        int area_rect=length*length;
        System.out.println("Area :"+area_rect);
    }
    public static void area(int base,double height) {
        double area_triangle = 0.5 * (base * height);
        System.out.println("Area :" + area_triangle);
    }

    public static void main(String[] args) {
        int length =10;
        int breadth =20;
        double height =8;
        int base=10;
        double sq_area;
        double rect_area;
        double tri_area;
        area(length);
        area(length,breadth);
        area(base,height);



    }
}
