import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double armut,elma,domates,muz,patlican;

        double armutKg = 2.14, elmaKg =3.67, domatesKg =1.11, muzKg=0.95, patlicanKg=5;

        Scanner inp = new Scanner(System.in);

        System.out.println("Satın aldığınız Armut kilogramını giriniz : ");
        armut = inp.nextDouble();

        System.out.println("Satın aldığınız Elma kilogramını giriniz : ");
        elma = inp.nextDouble();

        System.out.println("Satın aldığınız Domates kilogramını giriniz : ");
        domates = inp.nextDouble();

        System.out.println("Satın aldığınız Muz kilogramını giriniz : ");
        muz = inp.nextDouble();

        System.out.println("Satın aldığınız Patlıcan kilogramını giriniz : ");
        patlican = inp.nextDouble();


        double toplamFiyat =(armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg);

        System.out.println("Toplam fiyat : " + toplamFiyat);


    }

}