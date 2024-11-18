import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate:");
        double subtotal = scanner.nextDouble();
        double gratuity = scanner.nextDouble();
        double pasuxi = (subtotal * gratuity) / 100;
        double digits = subtotal + pasuxi;
        System.out.println("The gratuity is $" + pasuxi + " and total is " + digits);
    }
}