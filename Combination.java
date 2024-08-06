import java.util.Scanner;

public class Combination {
    // Faktöriyel hesaplama
    public static long faktoryel(int n) {
        long sonuc = 1;
        for (int i = 1; i <= n; i++) {
            sonuc *= i;
        }
        return sonuc;
    }


    public static long kombinasyon(int n, int k) {
        return faktoryel(n) / (faktoryel(k) * faktoryel(n - k));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Toplam nesne sayısını girin (n): ");
        int n = input.nextInt();

        System.out.print("Seçilecek nesne sayısını girin (k): ");
        int k = input.nextInt();

        if (k > n) {
            System.out.println("Seçilecek nesne sayısı toplam nesne sayısından fazla olamaz.");
        } else {
            long sonuc = kombinasyon(n, k);
            System.out.println(n + " nesneden " + k + " tanesinin kombinasyonu: " + sonuc);
        }


    }
}
