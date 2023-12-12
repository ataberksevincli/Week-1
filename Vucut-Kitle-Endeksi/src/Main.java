import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy,kilo;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Lütfen Kilonuzu giriniz : ");
        kilo = inp.nextDouble();

        double kitleIndeksi = kilo / (boy * boy);

        System.out.println("Vücüt kitle indeksiniz : " + kitleIndeksi);


    }

}