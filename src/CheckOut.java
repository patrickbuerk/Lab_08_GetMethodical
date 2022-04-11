import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double total = 0;
        boolean done = false;
        do{
            itemPrice = SafeInput.getRangedDouble(in,"enter the price of the item : ", 0.50,9.99);
            total = total + itemPrice;
            done = SafeInput.getYNConfirm(in, "do you have another item? : ");

        }while (!done);
    }

}
