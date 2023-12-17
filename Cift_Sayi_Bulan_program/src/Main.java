import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int k, adet = 0, toplam =0;
        double ortalama;

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        k = inp.nextInt();

        for (int i = 0; i <= k; i++){
            if ( i % 3 == 0 && i % 4 == 0);
            toplam += i;
            adet++;

          // TEST SOUTLARI
            //   System.out.println("toplam : " + toplam);
          //  System.out.println("adet : " + adet);

        }

              ortalama = toplam / adet;

        System.out.println("Girdiğiniz sayının koşula göre ortalaması : " + ortalama);

    }
}