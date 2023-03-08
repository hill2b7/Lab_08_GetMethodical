import java.util.Scanner; //import of scanner

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); // setup new scanner
        double priceOfItem = 0, totalCost = 0; //Double declaration
        boolean done = false; //boolean declaration
        String endGame = ""; //String declaration

        do // do loop will run until the while condition is met
        {
            priceOfItem = SafeInput.getRangedDouble(in, "Enter the price of your item: ", .50, 9.99); //calls method from safeinput to verify input
            done = SafeInput.getYNConfirm(in,"Do you want to enter another item? ");//calls method from safeinput to verify input
            totalCost = totalCost + priceOfItem; // calculation for the total cost
        }
        while(done); // loop will continue as long as done is still present
        System.out.printf("The total cost is %1.2f \n" , totalCost); //prints out total cost result

    }
}