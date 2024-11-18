import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("sheiyvanet gradusi celsiusis");
        double cvladi = scaner.nextDouble();
        double meorecv = (9.0 / 5) * cvladi + 32;
        System.out.println(cvladi + " celsiusi aris " + meorecv + " farengeiti");


    }
}