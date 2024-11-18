import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%):");
        double balance = scanner.nextDouble();
        double anualinterest = scanner.nextDouble();
        double interest = balance *(anualinterest/1200);
        System.out.println("The interest is "+interest);
    }
}