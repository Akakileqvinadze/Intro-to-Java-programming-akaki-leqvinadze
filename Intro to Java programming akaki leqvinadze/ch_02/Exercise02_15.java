import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Enter x1 and y1:");
        double x1 = scaner.nextDouble();
        double y1 = scaner.nextDouble();
        System.out.print("Enter x2 and y2:");
        double x2 = scaner.nextDouble();
        double y2 = scaner.nextDouble();
        double length = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("The distance between the two points is "+ length);

    }
}