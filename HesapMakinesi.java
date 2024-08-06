import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int s1,s2,select;

        Scanner hesap = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        s1= hesap.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        s2= hesap.nextInt();

        System.out.println("1-Çıkarma\n2-Toplama\n3-Çarpma\n4-Bölme");
        System.out.println("Tercihiniz Nedir ?");
        select = hesap.nextInt();

        if (select==1){
            System.out.println("Toplam : " + (s1 + s2));
        }
        else if (select==2) {
            System.out.println("Çıkarma : " + (s1 - s2));
        }
        else if (select==3) {
            System.out.println("Çarpma : " + (s1 * s2));
        }
        else if (select==4) {
            System.out.println("Bölme : " + (s1 / s2));
        }
        else {
            System.out.println("Yanlış seçim yaptıysanız tekrar deneyin.");
        }
    }
}
