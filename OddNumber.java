import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        int a;
        int toplam = 0;
        Scanner tek =new Scanner(System.in);

        do {
            System.out.println("Sayı giriniz :");
            a = tek.nextInt();
            if (a % 2 == 1){
                toplam += a;

            }
        } while (a > 0);
        System.out.println("Toplam :" + toplam);
    }
}

