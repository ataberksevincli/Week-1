import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       double nFakt = 1;
       double rFakt = 1;
       double zFakt = 1;

       double kombinasyon;


        Scanner input = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını giriniz : ");
        int n = input.nextInt();

        System.out.print("Kümenin eleman kombinasyonu sayısını giriniz : ");
        int r = input.nextInt();

        double z = n - r;

        for (int i = 1; i <= n; i++){
            nFakt *= i;
        }

        for (int i = 1; i <= r; i++){
            rFakt *= i;
        }

        for (int i = 1; i <= z; i++){
            zFakt *= i;
        }

kombinasyon = nFakt / (rFakt * zFakt);

        System.out.println(n + " in" + r + " li kombinasyonu : " + kombinasyon);

    }
}

