import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();


        int toplam = basamakToplami(sayi);


        System.out.println(sayi + " sayısının basamak sayılarının toplamı: " + toplam);
    }

    public static int basamakToplami(int sayi) {
        int toplam = 0;


        while (sayi > 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }

        return toplam;

    }
}