import java.util.Scanner;

public class DevTest {

    public static void main(String[] args)
    {
 /*
        Scanner in = new Scanner(System.in);
        int fInt = 0;
        double fDouble = 0;
        fInt = SafeInput.getInt(in,"enter you favorite integer: ");
        fDouble = SafeInput.getDouble(in, "Enter your favorite double: ");
        System.out.println("Your favorite integer is "+fInt);
        System.out.println("Your favorite integer is "+fDouble);



        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double total = 0;
        boolean done = false;
        do{
            itemPrice = SafeInput.getRangedDouble(in,"enter the price of the item : ", 0.50,9.99);
            total = total + itemPrice;
            done = SafeInput.getYNConfirm(in, "do you have another item? : ");

        }while (done);


        Scanner in = new Scanner(System.in);
        String socialSecureNum;
        String mNumber;
        String menuChoice;

        socialSecureNum= SafeInput.getRegExString(in, "enter SSN: ", "\\d{3}-\\d{2}-\\d{4}");
        mNumber = SafeInput.getRegExString(in, "enter your m Number: ", "(M|m)\\d{5}");
        menuChoice = SafeInput.getRegExString(in,"open, save view or quit?: ","[OoSsVvQq]");

        System.out.println("your Social security number is : "+socialSecureNum);
        System.out.println("your m number is "+mNumber);
        switch (menuChoice){
            case "o": case "O":
                System.out.println("open");
                break;
            case "s": case "S":
                System.out.println("Save");
                break;
            case "v": case"V":
                System.out.println("view");
                break;
            case "q": case "Q":
                System.out.println("quit");
                break;



        }*/
        SafeInput.prettyHeader("Message centered here");


    }
}
