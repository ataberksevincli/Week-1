import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName,password,yeniSifre,sifreDogrulama = null;
        Scanner inp = new Scanner(System.in);

        // Kullanıcı adı ve şifre oluşturduğumuz kısım
        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        password = inp.nextLine();

        // KUllanıcı adımızın doğru olup olmadığını sorguladığımız kısım
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else{
            // Şifrenin yanlış olduğu durumda yönlendirme yaptığımız kısım
            System.out.println("Kullanıcı adı veya şifre Yanlış");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? : y/n");
            sifreDogrulama = inp.nextLine();
        }
// Yönlendirme sonucunun olumlu olması durumunda şifre yenilediğimiz kısım
        switch (Objects.requireNonNull(sifreDogrulama)) {
            case "y":
                System.out.println("Yeni parolanızı giriniz : ");
                yeniSifre = inp.nextLine();
                System.out.println(yeniSifre.equals("java123") ? "Eski şifrenizi tekrar kullanamazsınız : " : "Yeni şifre oluşturuldu.");
                break;
                // Yönlendirme sonucunun olumsuz olması durumunda kodu bitirdiğimiz kısım
            case "n":
                System.out.println("Şifresiz giriş yapılamaz.");
                break;
                // Yönlendirme yapılırken y/n kullanılmaması durumunda çıkacak bildirim.
            default:
                System.out.println("Lütfen y/n şeklinde seçim yapınız.");

        }


    }
}