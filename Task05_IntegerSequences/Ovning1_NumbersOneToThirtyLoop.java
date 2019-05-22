package LexiconRehearsals.Task05_IntegerSequences;


public class Ovning1_NumbersOneToThirtyLoop {

    public static void main(String[] args) {

        Ovning1_NumbersOneToThirtyLoop inseq = new Ovning1_NumbersOneToThirtyLoop();
        System.out.println("\n");

        inseq.numberInLineFor();
        System.out.println("\n");
        inseq.numberInSquareFor();
        System.out.println("\n");

        inseq.numberInLineWhile();
        System.out.println("\n");
        inseq.numberInSquareWhile();
        System.out.println("\n");
    }

    void numberInLineFor() {
        System.out.println("With a for loop");
        for (int i = 1; i < 31; i++) {
            System.out.print(i + " ");
        }
    }

    void numberInSquareFor() {
        for (int i = 1; i < 31; i++) {
            System.out.print(i + " ");
            if (i % 5 == 0)
            System.out.println();
        }
    }

    void numberInLineWhile() {
        System.out.println("With a while loop");
        int n = 1;
        while (n < 31) {
            System.out.print(n + " ");
            n++;
        }
    }

    void numberInSquareWhile() {
        int n = 1;
        while (n < 31) {
            System.out.print(n + " ");
            if (n % 5 == 0)
                System.out.println();
            n++;
        }
    }
}


/*
https://www.baeldung.com/java-iterate-list
http://www.guideforschool.com/1280095-java-program-to-print-magic-square-matrix/
 */