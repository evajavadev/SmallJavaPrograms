package LexiconRehearsals.Task04_Arithmetics;

import java.util.Scanner;


public class Ovning2_TwoIntegersAdditionContinue {

    static Scanner scan = new Scanner(System.in);


    boolean doContinue (){                                              // variant nr 2
        System.out.println("\nDo you wish to continue (y/n)? ");
        return scan.nextLine().equalsIgnoreCase("y") ||
                scan.nextLine().equalsIgnoreCase("ye")||
                scan.nextLine().equalsIgnoreCase("yes");
    }


    void doYouWishToContinue() {
        String yes = "y";
        String no = "n";

        boolean cont = true;
        System.out.println("\nDo you wish to continue (y/n)? ");
        String wishAnswer;
        do {
            wishAnswer = scan.nextLine();
            if (wishAnswer.equalsIgnoreCase(yes)) {                     // variant nr 2 || wishAnswer.equalsIgnoreCase(y.substring(0,1))) {
                additionContinue();
                cont = false;
            }
            else if (wishAnswer.equalsIgnoreCase(no)) {
                cont = false;
            }
            else {
                System.out.println("Please enter \"y\" or \"n\"");
             }

        } while (cont);
     }


    void additionContinue() {

        int number1;
        int number2;
        int inputAnswer;
        int resultAnswer;

        System.out.print("\n\nEnter two numbers, start with the first one : ");
        number1 = scan.nextInt();
        System.out.print("...and the second number : ");
        number2 = scan.nextInt();
        System.out.print("What is " + number1 + " + " + number2 + " ? ");
        inputAnswer = scan.nextInt();
        scan.nextLine();

        resultAnswer = number1 + number2;

        if (inputAnswer == resultAnswer)
            System.out.println("Great, yes! The answer is " + resultAnswer);
        else
            System.out.println("Sorry, correct answer is " + resultAnswer);

        doYouWishToContinue();
    }
}