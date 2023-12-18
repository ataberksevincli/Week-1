import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        int n2 = input.nextInt();
        int ebob = 1;

        // WHILE LOOP
int i = 1;
if ( n1 < n2) {
    while (i <= n1) {
        i++;
        if (n1 % i == 0 && n2 % i == 0) {
            ebob = i;
        }
    }
}else {
    while (i <= n2){
        i++;
        if (n1 % i == 0 && n2 % i == 0) {
            ebob = i;
        }
    }
}  System.out.println("Sayılarınızın EBOB'u : " + ebob + " " + "Sayılarınızın EKOK'u : " + (n1 * n2) / ebob);


        /* FOR LOOP
        if (n1 < n2) {
            for (int i = 1; i <= n1; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
        } else {
            for (int i = 1; i <= n2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
        }
        System.out.println((n1*n2)/ ebob);*/
    }
}