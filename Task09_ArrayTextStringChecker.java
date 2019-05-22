import java.util.Scanner;


public class Task09_ArrayTextStringChecker {

    Scanner scan = new Scanner(System.in);
    String[] sentences;
    int numberOfStrings;

    public static void main(String[] args) {
        Task09_ArrayTextStringChecker t9 = new Task09_ArrayTextStringChecker();
        t9.askAmountOfStrings();
        t9.returnOfStrings();
        t9.stringSeacherByOneLetter();
    }

    void askAmountOfStrings() {
        System.out.print("\nEnter how many sentences you wish to write : ");
        numberOfStrings = Integer.valueOf(scan.nextLine());
    }

    void returnOfStrings() {
        sentences = new String[numberOfStrings];
        System.out.println();
        for (int i = 0; i < sentences.length; i++) {

            System.out.print((i + 1) + " : ");
            sentences[i] = scan.nextLine();
        }
    }

    void stringSeacherByOneLetter() {
        System.out.print("\nSearch for : ");
        String searchString = scan.nextLine();

        int noOfHits = 0;
        StringBuffer resultStr = new StringBuffer();

        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].contains(searchString)) {
                noOfHits++;
                resultStr.append(sentences[i] + "\n");
            }
        }

        /*  the neat variant on the for loop above
        for (Stings x : sentences) {
            if x.contains(searchStrings)
            noOfHits++;
            resultStr.append(x);
        }
         */

        if (noOfHits == 0)
            System.out.println("Did not find any sentences containing " + searchString);
        else
            System.out.println(resultStr);
    }
}