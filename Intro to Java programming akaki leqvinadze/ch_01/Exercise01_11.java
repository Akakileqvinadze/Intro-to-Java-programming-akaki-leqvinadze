import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double dabadeba = 7;
        double kvdeba = 13;
        double emigranti = 45;
        // ert celicadshi aris 365 dge,
        // 365*24*60*60*5=157680000
        // 54 cekucadshi aris 157680000 cami
        //
        double cami = 365*24*60*60*5;
        double pasuxi = 312032486+((cami/7)+(cami/45)-(cami/13));

        System.out.println("The distance between the two points is "+ pasuxi);

    }
}