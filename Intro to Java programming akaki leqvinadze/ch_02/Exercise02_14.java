import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds:");
        // one pound is 0.45359237 kilograms
        //one inch is 0.0254 meters
        double pound = scanner.nextDouble();
        System.out.print("Enter height in inches:");
        double inches = scanner.nextDouble();
        double kilogrami = 0.45359237 * pound;
        double metri = 0.0254 * inches;
        double BMI = kilogrami / Math.pow(metri, 2);
        System.out.println("BMI is " + BMI);
    }
}