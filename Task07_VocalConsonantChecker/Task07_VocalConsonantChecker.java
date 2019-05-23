import java.util.Scanner;


public class Task07_VocalConsonantChecker {

    public static void main(String[] args) {

        int vocal = 0;
        int cons = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a sentence (or some letters) : ");
        String rad = scanner.nextLine();
        char[] vowels = {'a','e','u','i','o','y','å','ö','ä',
                'E','U','I','O','Y','Å','Ö','Ä'};
        char[] consonants = {'q','w','r','t','p','s','d','f',
                'g','h','j','k','l','z','x','c','v','b','n','m',
                'Q','W','R','T','P','S','D','F','G','H','J','K',
                'L','Z','X','V','B','N','M'};

        for(int i=0; i<rad.length() ; i++)
            for(int j=0; j<vowels.length; j++)
                if (rad.charAt(i)==vowels[j])
                    vocal++;

        for(int a=0; a<rad.length() ; a++)
            for(int b=0; b<consonants.length; b++)
                if (rad.charAt(a)==consonants[b])
                    cons++;

        System.out.println("\nThe row includes " + rad.length() + " characters,\n" +
                "whence " + vocal + " are vocales\n" +
                "and " + cons + " are consonants");
    }
}