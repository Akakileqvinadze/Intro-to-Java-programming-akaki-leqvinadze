import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F:");
        // one pound is 0.45359237 kilograms
        //one inch is 0.0254 meters
        double temperature = scanner.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour:");
        double miles = scanner.nextDouble();
        double windchill = 35.74+0.6215*temperature-35.75*Math.pow(miles,0.16)+0.4275*temperature*Math.pow(miles,0.16);
        System.out.println("The wind chill index is " + windchill);
    }
}