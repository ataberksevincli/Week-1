import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dilediğiniz yılı giriniz : ");
        yil = inp.nextInt();

        if (yil > 1) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + " bir artık yıldır");
                } else {
                    System.out.println(yil + " artık yıl değildir.");
                }
            } else if (yil % 4 == 0) {
                System.out.println(yil + " bir artık yıldır");

            } else {
                System.out.println(yil + " artık yıl değildir.");
            }
        }
    }
}