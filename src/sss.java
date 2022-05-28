import java.util.Scanner;
public class sss {
    public static void main(String[] args) {
        // Değişkenler
        double armut;
        double elma;
        double domates;
        double muz;
        double patlican;
        double kilo;


        // Kullanıcıdan verileri al ve aynı zamanda hesaplamaları yap
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo: ");
        kilo = input.nextDouble();
        armut = kilo * 2.14d;

        System.out.print("Elma kaç kilo: ");
        kilo = input.nextDouble();
        elma = kilo * 3.67d;

        System.out.print("Domates kaç kilo: ");
        kilo = input.nextDouble();
        domates = kilo * 1.11d;

        System.out.print("Muz kaç kilo: ");
        kilo = input.nextDouble();
        muz = kilo * 0.95d;

        System.out.print("Patlıcan kaç kilo: ");
        kilo = input.nextDouble();
        patlican = kilo * 5.00d;


        // Sonucu yazdır
        System.out.println("Toplam fiyat: " + (elma + armut + domates + muz + patlican));

    }
}
