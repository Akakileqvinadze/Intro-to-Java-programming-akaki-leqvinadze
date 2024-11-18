import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double area, volume;
        Scanner scaner = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder:");
        double radius = scaner.nextDouble();
        double length = scaner.nextDouble();
        area = radius * radius * 3.14;
        volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}