import java.util.Scanner;
public class GetUserName

{


    public void main (String[] args)
    {String FName="";
        String LName="";
        Scanner in = new Scanner(System.in);
        FName = SafeInput.getNonZeroLenString(in,"enter your first name");
        LName = SafeInput.getNonZeroLenString(in,"enter your last name");
        System.out.println("Your first name is "+FName+" Your Last name is "+LName);
    }




}
