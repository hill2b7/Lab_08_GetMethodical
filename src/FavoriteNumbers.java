import java.util.Scanner; //import of scanner
public class FavoriteNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //sets up new scanner
        int favInt = 0; // int declaration
        double favDouble = 0; // Double declaration

        favInt = SafeInput.getInt(in,"Enter your favorite Integer: "); //calls method from SafeInput to verify that input for favInt will be valid
        favDouble = SafeInput.getDouble(in,"Enter your favorite Double: ");//calls method from SafeInput to verify that input for favDouble will be valid
        System.out.println("Your favorite integer is " + favInt + " and your favorite double is " + favDouble + "."); //echos what the user chose for their int and double
    }
}

