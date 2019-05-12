import java.util.Scanner;


public class MathRunningDreams {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // fråga 1
        System.out.print("\n\nHej! Hur snabbt (m/s) sprang du nu sist " +
                "när du tränade? ");
        double meterPerSec1 = Double.parseDouble(scan.nextLine());
        System.out.print("Hur lång tid tog det i sekunder? ");
        double sec = Double.parseDouble(scan.nextLine());
        System.out.println("\nTjusigt! Då har du på " + sec + " sekunder " +
                "sprungit " + meterPerSec1 * sec + " meter.\n\n");

        // fråga 2
        System.out.println("I torsdags tränade du inför långloppet." +
                "I vilken hastighet sprang du då?");
        double meterPerSec2 = Double.parseDouble(scan.nextLine());
        System.out.println("Hur många minuter tog det?");
        double min = Double.parseDouble(scan.nextLine());
        System.out.println("...och i resterande sekunder?");
        double resSec = Double.parseDouble(scan.nextLine());
        System.out.println("Grymt! Då sprang du " + meterPerSec2 * (resSec + min * 60)+
                " meter på " + min + " minuter och " + resSec + " sekunder.\n\n");

        //fråga 3
        System.out.println("Hur snabbt (km/tim) springer du Vätten runt?");
        double kmPerH = Double.parseDouble(scan.nextLine());
        System.out.println("Hur många minuter tog det?");
        double minutes = Double.parseDouble(scan.nextLine());
        System.out.println("...och i resterande sekunder?");
        double resSeconds = Double.parseDouble(scan.nextLine());

        double calc = (kmPerH * 1000)/(60*60) * (resSeconds + minutes * 60);

        System.out.println("Aha! Det innebär att Vättenloppet är " +
                calc + " meter långt ( " + calc/1000 + " kilometer).\n\n");
    }
}