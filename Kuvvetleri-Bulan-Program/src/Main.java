import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2;
        Scanner input = new Scanner(System.in);
        ;

        System.out.print(" İlk numara için Sınır sayısını giriniz : ");
        n1 = input.nextInt();

        System.out.print("İkinci Numara için Sınır sayısını giriniz : ");
        n2 = input.nextInt();

        for (int i = 1; i <= n1; i *= 4) {

            System.out.println(i);
        }

        System.out.println("----------");

        for (int j = 1; j <= n2; j *= 5) {

            System.out.println(j);
        }

    }
}

