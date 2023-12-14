import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int dogumYili,kalan;
        String zodyak="";

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum Yılınızı giriniz : ");
        dogumYili = inp.nextInt();

        kalan = dogumYili % 12;
if (dogumYili > 1){
        if(kalan == 0){
            zodyak = "Maymun";
        } else if (kalan == 1) {
            zodyak = "Horoz";
        }else if (kalan == 2) {
            zodyak = "Kopek";
        }else if (kalan == 3) {
            zodyak = "Domuz";
        }else if (kalan == 4) {
            zodyak = "Fare";
        }else if (kalan == 5) {
            zodyak = "Okuz";
        }else if (kalan == 6) {
            zodyak = "Kaplan";
        }else if (kalan == 7) {
            zodyak = "Tavsan";
        }else if (kalan == 8) {
            zodyak = "Ejderha";
        }else if (kalan == 9) {
            zodyak = "Yilan";
        }else if (kalan == 10) {
            zodyak = "At";
        }else if (kalan == 11) {
            zodyak = "Koyun";
        }

        System.out.println("Çin zodyağınız : " + zodyak);

    }else{
        System.out.println("Yanlış Değer girdiniz.");
    }
}
}