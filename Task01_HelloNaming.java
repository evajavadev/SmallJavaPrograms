import java.util.Scanner;


public class Task01_HelloNaming {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("\n\nHi! My name is Apollo Apricot Eckert–Mauchly. What's yours? ");
        String inputAnswer = scan.nextLine();
        System.out.println("\nHi " + inputAnswer + "! Wazzaaaap! :)\n"); 
    } 
}