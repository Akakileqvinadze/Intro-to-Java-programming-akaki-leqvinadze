import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t:");
        double v0 = scaner.nextDouble();
        double v1 = scaner.nextDouble();
        double t = scaner.nextDouble();
        double a = (v1-v0)/t;
        System.out.println("The average acceleration is "+a);

    }
}