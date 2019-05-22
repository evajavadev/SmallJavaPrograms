package LexiconRehearsals.Task06_StartAndStopLoops;

import java.util.Scanner;


public class Ovning1_BeginningAndEndNumbersRowsLoop {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Ovning1_BeginningAndEndNumbersRowsLoop ovn1 = new Ovning1_BeginningAndEndNumbersRowsLoop();
        ovn1.numberStartStop();
    }

    public void numberStartStop(){
        int i, start, stop, counter = 1;

        System.out.print("\nEnter the first number : ");
        start = scan.nextInt();
        System.out.print("Enter the last number: ");
        stop = scan.nextInt();

        i = start;
        System.out.println();
        while(i <= stop){
            System.out.print(i+" ");
            if(counter%10 == 0){
                System.out.println();
            }
            i++;
            counter++;
        }
        System.out.println();
    }
}