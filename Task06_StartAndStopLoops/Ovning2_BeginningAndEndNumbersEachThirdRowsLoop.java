package LexiconRehearsals.Task06_StartAndStopLoops;

import java.util.Scanner;


public class Ovning2_BeginningAndEndNumbersEachThirdRowsLoop {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int i, start, counter = 1;

        System.out.print("\nEnter the first number : ");
        i = scan.nextInt();
        System.out.print("Enter the last number : ");
        start = scan.nextInt();
        System.out.println();

        while (i <= start) {
            if (counter % 3 == 0) {
                System.out.print(i+ " ");
            }
            i++;
            counter++;
        }
        System.out.println();
    }
}