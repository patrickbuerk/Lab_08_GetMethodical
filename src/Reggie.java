import java.util.Scanner;
public class Reggie
{
    public static void main(String[] args){
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


        }
    }


}
