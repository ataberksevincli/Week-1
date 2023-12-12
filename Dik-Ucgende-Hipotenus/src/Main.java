import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a, b, c;


        Scanner girdi = new Scanner(System.in);

        System.out.print("1. Kenarı giriniz : ");
        a = girdi.nextInt();

        System.out.print("2. Kenarı giriniz: ");
        b = girdi.nextInt();

        System.out.print("3. Kenarı giriniz");
        c = girdi.nextInt();

        double u = (a+b+c) / 2;
        double cevre = 2 * u;

        double alan = Math.sqrt(u * (u - a)* (u - b) * (u - c));

        System.out.print("Üçgenin alanı : " + alan);


    }
}