import java.util.Scanner;
public class FavNumbers
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int fInt = 0;
        double fDouble = 0;
        fInt = SafeInput.getInt(in,"enter you favorite integer: ");
        fDouble = SafeInput.getDouble(in, "Enter your favorite double: ");
        System.out.println("Your favorite integer is "+fInt);
        System.out.println("Your favorite integer is "+fDouble);

    }
}
