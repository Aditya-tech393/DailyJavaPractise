import java.util.Scanner;

public class SwitchChallenge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character between A-Z: ");
        char vowel=sc.next().charAt(0);

        switch (Character.toLowerCase(vowel)){
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println(vowel+" is a vowel");
                break;
            default:
                System.out.println(vowel+" is not a vowel");
        }
    }
}
