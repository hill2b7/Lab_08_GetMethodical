import java.util.Scanner; //import of Java Scanner
public class GetUserName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //sets up new scanner
        String firstName = ""; //String Declaration
        String lastName = ""; //String Declaration
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name"); //calls method from SafeInput to verify that input will be valid
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");//calls method from SafeInput to verify that input will be valid
        System.out.println("\nYour full name is: " + firstName + " " + lastName); //echos what the user entered for their name
    }

}