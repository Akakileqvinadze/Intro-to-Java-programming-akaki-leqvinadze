import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Enter the side:");
        double s = scaner.nextDouble();
        double hexagon = (3*Math.sqrt(3)/2)*Math.pow(s,2);
        System.out.println("The distance between the two points is "+ hexagon);

    }
}