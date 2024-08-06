import java.util.Scanner;

public class dAlanCevre {
    public static void main(String[] args) {
        int r;
        double pi = 3.12;
        Scanner daire = new Scanner(System.in);


        System.out.println("Dairenin Yarı Çapını Giriniz : ");
        r = daire.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı :" + alan);
        System.out.println("Dairenin Çevresi :" + cevre);
    }
}
