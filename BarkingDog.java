public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if (hourOfDay >= 1 && hourOfDay <= 23)
        {
            if ((barking == true) && (hourOfDay < 8 || hourOfDay > 22))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }

    }
    public static void main(String[] args)
    {
        boolean response = shouldWakeUp(true, 9);
        System.out.println(response);
    }
}
