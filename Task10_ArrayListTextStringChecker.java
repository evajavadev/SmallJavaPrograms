package LexiconRehearsals.Task10_ArrayListTextStringChecker;

import java.util.Scanner;


public class Task10_ArrayListTextStringChecker {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        int side, number, a, b;

        System.out.print("\n\tPlease Enter any Side of a Square : ");
        side = scan.nextInt();

        System.out.print("\tPlease Enter any Integer Value : ");
        number = scan.nextInt();
        System.out.println(" ");

        for(a = 0; a < side; a++)
        {
            for(b = 0; b < side; b++)
            {
                System.out.print("\t" + number + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
    }
}