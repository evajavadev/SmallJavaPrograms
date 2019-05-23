import java.util.Scanner;


public class Task08_SevenNumberChecker {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Task08_SevenNumberChecker t8 = new Task08_SevenNumberChecker();
        t8.checkSeven();
    }

    private static void checkSeven() {

        final int maxVal = 7;
        int [] values = new int[maxVal];
        int largest = 0, largestpos = 0;
        int[] intervalVal = new int[2];

        // beskrivning
        System.out.println("\nEnter " + maxVal + " integers \n");
        for (int i = 0; i < values.length; i++) {
            System.out.print((i+1) + ": ");
            values[i] = scan.nextInt();
        }

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] +" ");
            largest = Integer.max(largest,values[i]);
            largestpos = i;
        }

        // beskrivning
        System.out.println();
        System.out.println("\nThe largest number is " + largest + " and was found " +
                "in array position " + (largestpos+1));

        System.out.println();
        System.out.println("\nEnter interval to be nulled");
        for (int i = 0; i < intervalVal.length; i++) {
            System.out.print((i+1) + ": ");
            intervalVal[i] = scan.nextInt();
        }

        for (int i = 0; i < values.length; i++) {
            if ((values [i] <= Integer.max(intervalVal[1],intervalVal[0])) &&
                    (values [i] >= Integer.min(intervalVal[1],intervalVal[0]))) {

                values [i] = 0;
            }
        }

        // beskrivning
        System.out.println();
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] +" ");
        }

        System.out.println();
        int numberOfZeroValues = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i]==0)
                numberOfZeroValues++;
            else
                System.out.print(values[i] + " ");
        }
        for (int i = 0; i <numberOfZeroValues; i++) {
            System.out.print("0 ");
        }

        System.out.println();
    }
}