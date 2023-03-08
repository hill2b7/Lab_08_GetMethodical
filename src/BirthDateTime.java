
import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0, birthYear = 0, birthHour = 0, birthDay = 0, birthMinute = 0;
        boolean done = false;
        String trash = "";

        birthMonth = SafeInput.getRangedInt(in, "Enter your birth month: ", 1, 12);
        switch (birthMonth)
        {
            case 4,6,9,11:
                birthDay = SafeInput.getRangedInt(in, "Enter your birthday: ", 1,30);
                break;
            case 1,3,5,7,8,10,12:
                birthDay = SafeInput.getRangedInt(in,"Enter your birthday: ", 1,31);
                break;
            case 2:
                birthDay = SafeInput.getRangedInt(in,"Enter your birthday : ", 1,29);
                break;

        }


                birthYear = SafeInput.getRangedInt(in, "Enter your birth year: ", 1950, 2010);
                birthHour = SafeInput.getRangedInt(in, "Enter your birth hour: ", 1, 24);
                birthMinute = SafeInput.getRangedInt(in, "Enter your birth minute: ", 1, 59);


        }
    }