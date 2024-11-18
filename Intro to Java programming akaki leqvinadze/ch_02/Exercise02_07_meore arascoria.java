import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes:Enter the number of minutes:");
        long minutes = scanner.nextLong();
        long time = (minutes/60)/24/365;
        long days = (minutes/60)/24;
        System.out.println(minutes+" minutes is approximately "+time+ " years and "+days+" days");
    }
}