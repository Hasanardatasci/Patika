import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        int n,k;
        Scanner sayi = new Scanner(System.in);
        System.out.print("Üssü alıncak sayı : ");
        n = sayi.nextInt();
        System.out.print("üs olcak sayı : ");
        k = sayi.nextInt();
        int toplam = 1;

        for (int i = 1; i <= k ; i++){
            toplam *= n;
        }
        System.out.println("Cevap : " + toplam);
    }
}
