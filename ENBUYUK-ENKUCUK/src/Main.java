import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz ? : ");
        int numberCounter = input.nextInt();
        int enbuyukSayi = 0;
        int enkucukSayi = 0;


        for (int i = 1; i<=numberCounter; i++){
            System.out.print("Sayılarınızı Giriniz : ");
            int sayilar = input.nextInt();
            if(sayilar < enkucukSayi || enkucukSayi == 0){
                enkucukSayi = sayilar;



            }if (enbuyukSayi < sayilar){
                enbuyukSayi = sayilar;
            }

        }

        System.out.println("Maximum değerdeki sayınız : " + enbuyukSayi + "\nMinimum değerdeki sayınız : " + enkucukSayi);

    }
}