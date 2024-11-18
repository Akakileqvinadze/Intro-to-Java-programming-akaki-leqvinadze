import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Enter a value for feet:");
        double feet = scaner.nextDouble();
        double meter = feet * 0.305;
        System.out.println(feet + " feet is " + meter + " meters");

    }
}