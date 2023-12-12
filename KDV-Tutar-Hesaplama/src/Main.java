import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

double tutar;

Scanner inp = new Scanner(System.in);
        System.out.print("Ürünün fiyatını giriniz. : ");
        tutar = inp.nextDouble();
        double kdvTutar = (tutar * 18) / 100 + tutar;
        System.out.println("Ürünün KDV dahil fiyatı : " + kdvTutar);


    }
}