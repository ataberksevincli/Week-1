import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,select;
// input alanları
        Scanner input = new Scanner(System.in);
        System.out.println("İlk Değeri giriniz : ");
        n1 = input.nextInt();

        System.out.println("İkinci Değeri giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        select = input.nextInt();

        // switch-case yapısı
        switch (select){
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma : " + (n1 * n2));
                break;
            case 4:
                System.out.println( (n2 == 0) ? "Bir sayı 0'a bölünemez." : " Bölme : " + (n1 / n2));
                break;
            default:
                System.out.println("Lütfem 1 ile 4 arasında bir seçim yapınız.");

        }






    }
}