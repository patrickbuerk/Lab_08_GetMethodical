import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hour=0;
        int min = 0;

        year = SafeInput.getRangedInt(in,"enter your birth year : ",1950, 2010);
        month = SafeInput.getRangedInt(in, "enter you birth month : ", 1, 12);
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = SafeInput.getRangedInt(in, "enter your birth day : ", 1, 31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = SafeInput.getRangedInt(in, "enter your birth day : ", 1, 30);
                break;
            case 2:
                day = SafeInput.getRangedInt(in, "enter your birth day : ", 1, 28);



        }
        hour = SafeInput.getRangedInt(in, "enter your hour of birth : ", 1,24);
        min = SafeInput.getRangedInt(in, "enter the minute you were born : ",1,59);
        System.out.println("The information you input was that your exact birthday is : "+month + "-"+day+"-"+year+" at "+hour+" : "+min);


    }
}
