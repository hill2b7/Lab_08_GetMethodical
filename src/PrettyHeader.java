
public class PrettyHeader
{
    public static void main(String[] args)
    {
        for (int x = 0; x<= 60; x++) //for loop that will run until x = 60
        {
            System.out.print("*"); //will print out a star for each time x increments
        }
        System.out.print("\n"); // breaks to new line

        SafeInput.prettyHeader("Multiple tests"); //call of SafeInput prettyHeader method

        System.out.print("\n"); //breaks to new line
        for (int x = 0; x <= 60; x++) //for loop that will run until x = 60
        {
            System.out.print("*"); // will print this until the loop conditions are met
        }

    }

}