import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        String name = "";
        Scanner in = new Scanner(System.in);

        name = SafeInput.getNonZeroLenString(in, "What is your name? ");
        System.out.println("You said your name was " + name);

        int num = 0;

        num = SafeInput.getInt(in, "What is your favorite number? ");
        System.out.println("You said your favorite number was " + num);

        int num2 = 0;

        num2 = SafeInput.getRangedInt(in,"Enter a number between", 1, 100);
        System.out.println("You entered " + num2);

        double doubleNum = 0;

        doubleNum = SafeInput.getDouble(in, "Enter any double");
        System.out.println("You entered " + doubleNum);

        doubleNum = SafeInput.getRangedDouble(in,"Enter a double between ", 1, 100);
        System.out.println("You entered " + doubleNum);

        boolean YN = false;
        YN = SafeInput.getYNConfirm(in, "Do you want to continue?");

        String input = "";
        input =SafeInput.getRegExString(in,"Enter q to continue :", "q");
    }
}