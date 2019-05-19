import java.util.Scanner;


public class Task03_BiggestArea {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        double circleArea;
        double lengthSquareSide;
        double lengthTriangleBase;
        double lengthTriangleHeight;
        double radiusCircle;
        double squareArea;
        double triangleArea;

        double maxValue;
        String maxString;

        // The square area
        System.out.print("\n\tEnter the side's lenght of a square: ");
        lengthSquareSide = scan.nextDouble();
        squareArea = lengthSquareSide * lengthSquareSide;

        // The circle area
        System.out.print("\n\tEnter the radius to a circle: ");
        radiusCircle = scan.nextDouble();
        circleArea = radiusCircle * radiusCircle * Math.PI;

        // The triangle area
        System.out.print("\n\tEnter a triangle's height: ");
        lengthTriangleHeight = scan.nextDouble();
        System.out.print("\t...and the base to the same triangle: ");
        lengthTriangleBase = scan.nextDouble();
        triangleArea = (lengthTriangleHeight * lengthTriangleBase) / 2;

        System.out.println("\n\tThe square area is: " + squareArea);
        System.out.println("\tThe circle area is: " + circleArea);
        System.out.println("\tThe triangle area is: " + triangleArea);

        // An algorithm that calculates the largest area
        maxValue = triangleArea;
        maxString = "\tThe triangle area is the largets one";

        if(circleArea > maxValue) {
            maxValue = circleArea;
            maxString = "\tThe circle area is the largets one";
        }
        if(squareArea > maxValue) {
            maxValue = squareArea;
            maxString = "\tThe square area is the largets one";
        }
        System.out.println("\n\t" + maxString + " : " + maxValue + "\n");
    }
}