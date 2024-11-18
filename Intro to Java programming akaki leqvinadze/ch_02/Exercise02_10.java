import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms:");
        double M = scaner.nextDouble();
        System.out.print("Enter the initial temperature:");
        double initialTemperature = scaner.nextDouble();
        System.out.print("Enter the initial finalTemperature:");
        double finalTemperature = scaner.nextDouble();
        double Q = M * (finalTemperature-initialTemperature) * 4184;
        System.out.println("The energy needed is "+Q);

    }
}