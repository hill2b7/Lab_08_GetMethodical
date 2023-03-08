import java.util.Scanner; //import of Java scanner
public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //Sets up new scanner
        String SSN = ""; // String Declaration
        String UCNum = ""; //String declaration
        String menuChoice = ""; //String Declaration


        SSN = SafeInput.getRegExString(in,"Enter you Social Security Number (###-##-####) ", "\\d{3}-\\d{2}-\\d{4}"); //calls method from SafeInput to verify that input will be valid also requires to follow specific pattern
        UCNum = SafeInput.getRegExString(in,"Enter your UC Student Number (M#####)", "(M|m)\\d{5}"); //calls method from SafeInput to verify that input will be valid also requires to follow specific pattern
        menuChoice = SafeInput.getRegExString(in,"O - Open S - Save V - View Q - Quit", "[OoSsVvQq]"); //calls method from SafeInput to verify that input will be valid also requires to follow specific pattern

    }

}