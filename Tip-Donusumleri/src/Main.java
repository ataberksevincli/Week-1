import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int inp1;
        double inp2;

        System.out.print("Bir tam sayı giriniz : ");
        inp1 = inp.nextInt();

        System.out.print("Bir ondalıklı sayı giriniz : ");
        inp2 = inp.nextDouble();

        System.out.println((double)inp1 + " " + (int)inp2);

    }
}