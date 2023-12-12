import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km;
        double perKM = 2.20 , total , baslangicTutari = 10;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = inp.nextInt();

        total = (perKM * km);
        total += baslangicTutari;

        total = (total <= 20) ? 20 : total;
        System.out.println("Toplam tutar:" + total);


        }
    }
