import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayınızı giriniz : ");
        int x = input.nextInt();

        int toplam = 0;

        if (x > 0) {

            for (int i = 1; i < x; i++) {
                if (x % i == 0) {
                    toplam += i;
                }
            }if (toplam == x){
                System.out.println(x + " Sayısı bir mükemmel sayıdır.");
            }else {
                System.out.println(x + " Sayısı mükemmel sayı değildir");
            }


        }


    }
}

