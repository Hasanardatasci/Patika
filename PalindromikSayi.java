import java.util.Scanner;

public class PalindromikSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (isPalindromik(sayi)) {
            System.out.println(sayi + " bir palindromik sayıdır.");
        } else {
            System.out.println(sayi + " bir palindromik sayı değildir.");
        }

        scanner.close();
    }

    public static boolean isPalindromik(int sayi) {
        int original = sayi;
        int ters = 0;

        while (sayi > 0) {
            int basamak = sayi % 10;
            ters = (ters * 10) + basamak;
            sayi /= 10;
        }

        return original == ters;
    }
}