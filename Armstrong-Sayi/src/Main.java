import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int total = 0;


        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            tempNumber /= 10;

            for (int i = 0; i <= basNumber; i++) ;
            total += basValue;

        }System.out.println("Toplam : " + total);


    }
}