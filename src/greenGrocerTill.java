import java.util.Scanner;
public class greenGrocerTill {
    public static void main(String[] args) {
        double Armut=2.14d,A,Elma=3.67d,E,Domates=1.11d,D,Muz=0.95d,M,Patlican=5,P,Total;
        Scanner input=new Scanner(System.in);
        System.out.print("Aldiginiz Armut Kutlesi(kg) :");
        A=input.nextDouble();
        System.out.print("Aldiginiz Elma Kutlesi(kg) : ");
        E=input.nextDouble();
        System.out.print("Aldiginiz Domates Kutlesi(kg) : ");
        D=input.nextDouble();
        System.out.print("Aldiginiz Muz Kutlesi(kg) : ");
        M=input.nextDouble();
        System.out.print("Aldiginiz Patlican Kutlesi:");
        P=input.nextDouble();
        Total= (Armut*A)+(Elma*E)+(Domates*D)+(Muz*M)+(Patlican*P);
        System.out.print("Toplam Odemeniz Gereken Miktar(tl) : "+ Total);

    }
}
