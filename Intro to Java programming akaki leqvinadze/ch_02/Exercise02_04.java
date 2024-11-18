import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Enter a number in pounds:");
        double feet = scaner.nextDouble();
        double meter = feet * 0.454;
        System.out.println(feet + " pounds " + meter + " kilograms");

    }
}