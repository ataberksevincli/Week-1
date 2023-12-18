import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        for (int i = 2; i <= 100; i++) {
            boolean asal = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }if (asal){
                System.out.println(i + " sayısı bir asal sayıdır.");

            }
        }
    }
}
