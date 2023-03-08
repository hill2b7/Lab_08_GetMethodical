import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double priceOfItem = 0, totalCost = 0;
        boolean done = false;
        String endGame = "";

        do
        {
            priceOfItem = SafeInput.getRangedDouble(in, "Enter the price of your item: ", .50, 9.99);
            done = SafeInput.getYNConfirm(in,"Do you want to enter another item? ");
            totalCost = totalCost + priceOfItem;
        }
        while(done);
        System.out.printf("The total cost is %1.2f \n" , totalCost);

    }
}