
import java.util.Scanner; // import of scanner
public class BirthDateTime
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // set up of new scanner
        int birthMonth = 0, birthYear = 0, birthHour = 0, birthDay = 0, birthMinute = 0; //sets all ints to 0 value
        boolean done = false; // boolean declaration
        String trash = ""; //String declaration

        birthMonth = SafeInput.getRangedInt(in, "Enter your birth month: ", 1, 12); //birthmonth value calls the safe input method
        switch (birthMonth) // switch that represents the months of the year.
        {
            case 4,6,9,11: // in case if 4 6 9 or 11 is picked, then it will set the days between 1 and 30 as those months only have 30 days
                birthDay = SafeInput.getRangedInt(in, "Enter your birthday: ", 1,30); //call of safe input method for ranged ints
                break; // switch break
            case 1,3,5,7,8,10,12: // in case if 1 3 5 7 8 10 or 12 is picked, then it will set the days between 1 and 31 as those months only have 31 days
                birthDay = SafeInput.getRangedInt(in,"Enter your birthday: ", 1,31);
                break; //switch break
            case 2: // in case 2 is picked, then it will set the days between 1 and 29 as those months only have 29 days
                birthDay = SafeInput.getRangedInt(in,"Enter your birthday : ", 1,29);
                break; //switch break

        }


                birthYear = SafeInput.getRangedInt(in, "Enter your birth year: ", 1950, 2010); //call for safeinput method get ranged int
                birthHour = SafeInput.getRangedInt(in, "Enter your birth hour: ", 1, 24); //call for safeinput method get ranged int
                birthMinute = SafeInput.getRangedInt(in, "Enter your birth minute: ", 1, 59); //call for safeinput method get ranged int


        }
    }