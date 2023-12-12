import java.util.Scanner;

public class Main {


public static void main(String[]args){

    int r;
    double a;
    double pi = 3.14;

Scanner inp = new Scanner(System.in);

    System.out.print("Yarı çap değerini giriniz : ");
    r = inp.nextInt();

    System.out.println("Merkez açısının ölçüsünü giriniz: ");
    a = inp.nextDouble();


double cevre = 2 * pi * r;
double alan = pi * r * r;
double daireDilimiAlani = (pi * (r*r) * a) / 360;
    System.out.println("Dairenin çevresi : " + cevre);
    System.out.println("Dairenin alanı : " + alan);
    System.out.println("Daire diliminin alanı : " + daireDilimiAlani);
}

}