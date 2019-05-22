package LexiconRehearsals.Task11_WhatsYourNameProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task11_Launcher {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Task11_Launcher launcher = new Task11_Launcher();
        launcher.enterPersonData();
    }

    void enterPersonData() {

        List<Person> persons = new ArrayList<>();

        String name = "";
        int age = 0;
        boolean cont = true;

        System.out.println("\nEnter a person, the name and age (to quit = q) ");
        while (cont) {
            System.out.print("Name? ");
            name = scan.nextLine();
            if (name.equalsIgnoreCase("q"))
                cont = false;
            else {
                System.out.print("Age? ");
                age = Integer.valueOf(scan.nextLine());

                persons.add(new Person(name,age));
            }
        }
        System.out.print("\nSearch for age : ");
        final int searchForAge = Integer.valueOf(scan.nextLine());

        persons.stream()
                .filter(item -> item.age == searchForAge)
                .forEach(item -> System.out.println(item.name));
    }

    private static void privateA() {

        System.out.println();
        System.out.println("\nTesting StringBuffer");

        StringBuffer stringBuffer = new StringBuffer("Tamer");
        stringBuffer.append(" was here");
        System.out.println(stringBuffer);

        stringBuffer.insert(10,"never ");
        stringBuffer.replace(0,5,"Richard");

        System.out.println(stringBuffer);
    }

    private static void privateB() {

        System.out.println();
        System.out.println("\nTesting StringBuilder");

        StringBuilder stringBuilder = new StringBuilder("Ahmed");
        stringBuilder.append(" was here");
        System.out.println(stringBuilder);

        stringBuilder.insert(10,"never ");
        stringBuilder.replace(0,5,"Richard");

        System.out.println(stringBuilder);
    }
}