import java.util.Scanner;


public class Task01_HelloNaming {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("\n\nHi! My name is Apollo Apricot Eckert–Mauchly. What's yours? ");

        String inputAnswer = scan.nextLine();
        System.out.println("\nHi " + inputAnswer + "! Wazzaaaap! :)\n");
    }
} 