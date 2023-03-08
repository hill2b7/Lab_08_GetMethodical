import java.util.Scanner;
public class PrettyHeader
{
    public static void main(String[] args)
    {
        for (int x = 0; x<= 60; x++)
        {
            System.out.print("*");
        }
        System.out.print("\n");

        SafeInput.prettyHeader("Multiple tests");

        System.out.print("\n");
        for (int x = 0; x<= 60; x++)
        {
            System.out.print("*");
        }

    }

}