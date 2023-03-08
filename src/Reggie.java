import java.util.Scanner;
public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String UCNum = "";
        String menuChoice = "";


        SSN = SafeInput.getRegExString(in,"Enter you Social Security Number (###-##-####) ", "\\d{3}-\\d{2}-\\d{4}");
        UCNum = SafeInput.getRegExString(in,"Enter your UC Student Number (M#####)", "(M|m)\\d{5}");
        menuChoice = SafeInput.getRegExString(in,"O - Open S - Save V - View Q - Quit", "[OoSsVvQq]");

    }

}