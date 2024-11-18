import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%):");
        double investmentAmount = scanner.nextDouble();
        double monthlyInterestRate = scanner.nextDouble();
        double numberOfYear = scanner.nextDouble();
        double futureInvestmentValue = investmentAmount*Math.pow(1+monthlyInterestRate,numberOfYear/12);
        System.out.println("The interest is "+futureInvestmentValue);

    }
}