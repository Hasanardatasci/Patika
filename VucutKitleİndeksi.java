import java.util.Scanner;

public class VucutKitleİndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ağırlığınızı (kg) girin: ");
        double agirlik = input.nextDouble();

        System.out.print("Boyunuzu (metre cinsinden) girin : ");
        double boy = input.nextDouble();


        double vucut= agirlik / (boy * boy);


        System.out.println("Vücut Kitle İndeksiniz :" + vucut);

        if (vucut< 18.5) {
            System.out.println("Durum: Zayıf");
        } else if (vucut >= 18.5 && vucut < 24.9) {
            System.out.println("Durum: Normal");
        } else if (vucut     >= 25 && vucut < 29.9) {
            System.out.println("Durum: Fazla kilolu");
        } else {
            System.out.println("Durum: Obez");
        }

    }
}
