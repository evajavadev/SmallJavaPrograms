package LexiconRehearsals.Task04_Arithmetics;

import java.util.Scanner;


public class Ovning1_TwoIntegersAdditionCheckSum {

    static Scanner scan = new Scanner(System.in);

    void twoIntegers() {

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

        resultAnswer = number1 + number2;

        if (inputAnswer == resultAnswer) {
            System.out.println("Great! The answer is " + resultAnswer);
        }
        else {
            System.out.println("Try again - the right answer is " + resultAnswer + "\n");
            twoIntegers();
        }
    }
}