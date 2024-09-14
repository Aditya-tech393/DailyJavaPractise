import java.util.Scanner;

class Calculate{
    public static void toGrams(double weight){
        double weight_in_grams=weight*100;
        System.out.println("The weight in grams is "+weight_in_grams+" gm.");
//        return weight_in_grams;
    }

    public static void to_milligrams(double weight) {
        double weight_in_milligrams = weight * 1000;
        System.out.println("The weight in grams is " + weight_in_milligrams + " milligrams.");
//        return weight_in_milligrams;
    }
    }
    public class WeightConverter {

    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the weight in KG : ");

        double weight_kg=sc.nextDouble();
//        toGrams(weight_kg);
//        to_milligrams(weight_kg);

    }
}
