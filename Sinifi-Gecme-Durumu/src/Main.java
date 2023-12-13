import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mat = 0, fizik = 0, turkce = 0, kimya = 0, muzik = 0;
        int toplam = 0;

        Scanner input = new Scanner(System.in);

            System.out.print("Matematik notunuzu giriniz : ");
            mat = input.nextInt();
            toplam += mat;


        if (mat > 0 && mat < 100) {

            System.out.print("Fizik nodunuzu giriniz : ");
            fizik = input.nextInt();
            toplam += fizik;

        }
        if (fizik > 0 && fizik < 100) {

            System.out.print("Türkçe notunuzu giriniz : ");
            turkce = input.nextInt();
            toplam += turkce;

        }
        if (turkce > 0 && turkce < 100) {

            System.out.print("Kimya notunuzu giriniz : ");
            kimya = input.nextInt();
            toplam += kimya;

        }
        if (kimya > 0 && kimya < 100) {

            System.out.print("Müzik notunuzu giriniz : ");
            muzik = input.nextInt();
            toplam += muzik;

        }
        if (muzik > 0 && muzik < 100) {

           double ortalama = toplam / 5;

            if (ortalama < 55.0) {
                System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere! ");

            } else {
                System.out.println("Sınıfı geçtiniz Tebrikler ! Ortalama Notunuz : " + ortalama);

            }

        }
    }
}