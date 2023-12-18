import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int x = input.nextInt();

        for (int i = x; i >= 1; i--) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
        }
            System.out.println();

        }

    }

}


