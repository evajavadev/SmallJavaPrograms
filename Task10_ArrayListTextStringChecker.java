import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task10_ArrayListTextStringChecker {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Task10_ArrayListTextStringChecker t10 = new Task10_ArrayListTextStringChecker();
        t10.listChecker();
    }

    void listChecker() {
        List<String> strings = new ArrayList<>();
        System.out.println();

        String input;
        boolean cont = true;

        while (cont) {
            System.out.print("Write a sentence and enter (and end with q): ");
            input = scan.nextLine();
            if (input.equalsIgnoreCase("q"))
                cont = false;
            else
                strings.add(input);
        }

        System.out.print("\nSearch for : ");
        String searchString = scan.nextLine();

        strings.stream()
                .filter(item -> item.contains(searchString))
                .forEach(System.out::println);
    }
}